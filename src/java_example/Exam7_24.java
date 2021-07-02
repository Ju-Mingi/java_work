/*배열 a의 요소 중에서 값이 x 인 모든 요소의 인덱스를 앞에서부터 순서대로 저장해서 반환하는 함수 searchArrayIdx 메서드 설계*/

package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7_24 {

	static int[] searchArrayIdx(int a[], int search_num) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search_num)
				cnt++;
		}
		int c[] = new int[cnt];
		cnt --;
		for (int i = a.length - 1; cnt >= 0; i--) {
			if (a[i] == search_num) {
				c[cnt] = i;
				cnt--;
			}
		}
		return c;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("요소 값 입력 : ");
		int search_num = sc.nextInt();
		int a[] = { 1, 5, 4, 8, 5, 5, 7 };
		int return_a[] = searchArrayIdx(a, search_num);
		if(return_a.length < 1) {
			System.out.println("없음");
		}
		System.out.print(Arrays.toString(return_a));

	}

}
