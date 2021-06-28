package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7_15 {

	static int sumOf(int x[]) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		System.out.println("x = " + Arrays.toString(x));
		System.out.println("모든 요소의 합은 : " + sumOf(x));
		sc.close();
	}

}
