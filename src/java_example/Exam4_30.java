package java_example;

import java.util.Scanner;

public class Exam4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 맞추기");
		int rightNum = (int) (Math.random() * 100);
		for (int i = 1; i <= 6; i++) {
			System.out.println("숫자 입력");
			int input = sc.nextInt();
			if (input < rightNum) {
				System.out.println("UP");
			} else if (input > rightNum) {
				System.out.println("DOWN");
			} else {
				System.out.println("정답!!");
				System.out.println(i +"번만에 맞추었습니다.");
				break;
			}
		}

	}

}
