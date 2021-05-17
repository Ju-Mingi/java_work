// 정수값을 입력받아서 음수가 아닌 값의 합계와 평균을 구하는 프로그램을 for문으로 작성
// 입력받는 음수의 개수는 평균을 구할 때 제외하시오.
package java_example;

import java.util.Scanner;

public class Exam4_28 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int n;
		int sum = 0;
		int cnt = 0;
		System.out.print("몇개를 더할까요? : ");
		n = stdInt.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("정수 입력 : ");
			int t = stdInt.nextInt();
			if (t < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			} else {
				sum += t;
				cnt++;
			}
		}
		System.out.print("합계 : " + sum);
		System.out.println();
		System.out.print("평균 : " + sum / cnt);
		stdInt.close();
	}
}
