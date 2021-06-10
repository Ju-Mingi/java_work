package java_example;

import java.util.Scanner;

import java.util.Random;

public class Exam6_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int input;
		do {
			System.out.print("요소수 입력 : ");
			input = sc.nextInt();
		} while (input > 10);

		int a[] = new int[input];
		a[0] = 1 + rd.nextInt(10);
		for (int i = 1; i < input; i++) {
			int j;
			do {
				a[i] = 1 + rd.nextInt(10);
				for (j = 0; j < i; j++) {
					if (a[j] == a[i]) {
						break;
					}
				}
			} while (j < i);
		}

		for (int i = 0; i < input; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
