package java_example;

import java.util.Scanner;

public class Exam7_4 {

	public static int sumUp(int n) {
		int sum = 0;
		for (int i = n; i > 0; i--) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		System.out.print("1부터 n까지의 합 (n 입력) : ");
		int n = stdInt.nextInt();
		System.out.println(sumUp(n));

	}

}
