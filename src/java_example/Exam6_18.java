/*4행3열의 행렬과 3행4열의 행렬을 곱하는 프로그램 작성
(각 요소는 키보드를 통해 값 입력)*/
package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[4][3];
		int b[][] = new int[3][4];
		System.out.println("행렬 a의 요소를 입력");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("행렬 b의 요소를 입력");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length+1; j++) {
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = sc.nextInt();

			}
		}
		int c[][] = new int[a.length][b[0].length];
		System.out.println("행렬 a와 b의 곱");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.println("c[" + i + "][" + j + "] = "+c[i][j]);
			}
			
		}
	}
}