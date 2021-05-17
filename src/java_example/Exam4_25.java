// 양의 정수를 입력받아서 소수인지 판정하는 프로그램을 작성하시오.
// 소수란 2이상 n미만인 수 중 어떤 수로도 나누어지지 않는 정수값 n 이다.

package java_example;

import java.util.Scanner;

public class Exam4_25 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		System.out.print("정수값 : ");
		int prime = 0;
		int n = stdInt.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				prime++;
			}
		}
		stdInt.close();
		if (prime == 2) {
			System.out.print("소수입니다.");
		} else {
			System.out.print("소수가 아닙니다.");
		}
	}
}
