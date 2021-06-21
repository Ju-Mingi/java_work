package java_example;

import java.util.Scanner;

public class Exam6_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학급 수 : ");
		int ClassNum = sc.nextInt();
		int class_sum = 0;
		int total_sum = 0;
		int totNumber = 0;
		int school[][] = new int[ClassNum][];
		for (int i = 0; i < school.length; i++) {
			System.out.printf("%d반의 학생 수 : ", i + 1);
			int student = sc.nextInt();
			school[i] = new int[student];
			totNumber += school[i].length;
			for (student = 0; student < school[i].length; student++) {
				System.out.print(student + 1 + "번의 점수 : ");
				school[i][student] = sc.nextInt();
				class_sum += school[i][student];
			}
			System.out.printf(i + 1+"반  합계 : "+class_sum+"  평균 : "+Math.round((class_sum / (double) school[i].length) * 10)/10.0);
			total_sum += class_sum;
			class_sum = 0;
			System.out.println();
		}
		System.out.println("학교 전체 합계 : " + total_sum + " 평균 : " + total_sum / (double) totNumber);
	}
}
