// 정수값을 연속해 입력받아 합계와 평균을 구하는 프로그램을 작성하시오.
// (0 입력 받으면 프로그램을 종료)

package java_example;

import java.util.Scanner;

public class Exam4_26 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);

		System.out.print("몇개의 정수를 더할까요? : ");
		int n = stdInt.nextInt();
		int sum = 0;
		int i;

		for (i = 0; i < n; i++) {
			System.out.print("정수 입력(종료 : 0) : ");
			int t = stdInt.nextInt();
			if (t != 0) {
				sum += t;
			} else {
				break;
			}
		}
		stdInt.close();
		System.out.print("합계 : " + sum);
		System.out.println();
		System.out.print("평균 : " + sum / n);

	}
}
