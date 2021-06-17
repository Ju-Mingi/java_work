/*행에 따라서 열의 개수가 다른 2차원 배열 생성
 * 행수, 열수, 각 요소의 값은 키보드로 입력받음*/
package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 수 : ");
		int row = sc.nextInt();
		int c[][] = new int[row][];
		for (int i = 0; i < c.length; i++) {
			System.out.print(i + " 행의 열 수 : ");
			int column = sc.nextInt();
			c[i] = new int[column];
			for (column = 0; column < c[i].length; column++) {
				System.out.print(column + 1 + "번 째 요소 값 : ");
				c[i][column] = sc.nextInt();
			}
			System.out.println();

		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
