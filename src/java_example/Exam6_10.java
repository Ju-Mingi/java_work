package java_example;

import java.util.Scanner;

import java.util.Random;

public class Exam6_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("요소수 입력 : ");
		int input = sc.nextInt();
		int a[] = new int[input];
		a[0] = 1 + rd.nextInt(10);
		for (int i = 1; i < input; i++) {
			do {
				a[i] = 1 + rd.nextInt(10);
			}while(a[i]==a[i-1]);
		}
		
		for (int i = 0; i < input; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}

	}

}
