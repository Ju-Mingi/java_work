package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[6][2];
		int sum = 0;
		System.out.println("6명의 국어 수학 점수 입력");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (j < 1) {
					System.out.print(i + 1 + "번\n 학생의 " + "국어 점수 입력 : ");
				} else {
					System.out.print(i + 1 + "번\n 학생의 " + "수학 점수 입력 : ");
				}
				a[i][j] = sc.nextInt();
				sum += a[i][j];
			}
		}
		
		System.out.println("No. \t\t 국어 \t\t 수학 \t\t 평균");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(i+1);
			for (int j = 0; j < a[0].length; j++) {
				System.out.print("\t\t  "+a[i][j]);
			}
			System.out.println("\t\t"+sum/6);
			System.out.println();
		}
	}

}
