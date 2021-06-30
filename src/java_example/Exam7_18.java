/*배열 a로부터 요소 a[idx]를 삭제하는 aryRmv method를 작성
삭제 후, 그 뒤에 있는 요소들을 앞으로 이동
이동 후 비게 되는 마지막 요소 a[a.length-1]의 값은 이동하기 전의 마지막 값을 유지*/

package java_example;

import java.util.Scanner;

public class Exam7_18 {

	static void aryRmv(int a[], int idx) {
		if (idx >= 0 && idx < a.length) {				// 배열에 존재하는 인덱스 값이 아닌 경우 삭제 X
			for (int i = idx; i < a.length - 1; i++) {
				a[i] = a[i + 1];

			}
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = sc.nextInt();
		aryRmv(a, idx);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}

	}

}
