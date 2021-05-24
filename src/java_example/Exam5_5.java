package java_example;

import java.util.Scanner;

public class Exam5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 값 입력 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 값 입력 : ");
		int second = sc.nextInt();
		System.out.print("세번째 정수 값 입력 : ");
		int third = sc.nextInt();
		int tot = first + second + third;
		double avg = (first + second + third) / (double)3;
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
		sc.close();

	}

}
