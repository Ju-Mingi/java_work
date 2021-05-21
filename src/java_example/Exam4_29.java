// 5개의 정수로 구성된 그룹의 전체 합게(그룹별 합계가 아닌 전체 그룹의 합)를 구하는 프로그램을 작성하시오.
// 전체 10개의 그룹이 있으며 각 정수값은 키보드로 입력한다.
// 99999를 입력하면 전체 입력을 종료
// 88888 입력 시 현재 읽고 있는 그룹의 입력을 종료

package java_example;

import java.util.Scanner;

public class Exam4_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수를 더합니다.");
		outloop: for (int Group = 1; Group <= 5; Group++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print(Group + " 그룹 " + i + " 번째 정수 : ");
				int input = sc.nextInt();
				if (input == 88888) {
					break;
				} else if (input == 99999) {
					break outloop;
				} else {
					sum += input;
				}
			}

		}
		System.out.print("총합 : " + sum);

	}

}
