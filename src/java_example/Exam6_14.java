package java_example;

import java.util.Scanner;
import java.util.Random;

public class Exam6_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("역순으로 복사");
		for (int i = 0; i < b.length; i++) {
			b[i] = a[n - i - 1];
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
