package java_example;

import java.util.Scanner;

public class Exam4_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		String star = "*";
		int stdInt = sc.nextInt();
		for (j = 1; j <= stdInt; j++) {
			for (i = 1; i <= stdInt; i++) {
				if(i<=j) {
					System.out.print(star);
				}
				else {
					System.out.print("");
				}
			}System.out.println();
		}sc.close();

	}

}
