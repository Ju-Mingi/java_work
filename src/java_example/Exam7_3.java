package java_example;

import java.util.Scanner;

public class Exam7_3 {
	public static int med(int a, int b, int c) {
		if ((a > b && a < c) || (a > c && a < b)) {
			return a;
		} else if ((b > a && b < c) || (b > c && b < a)) {
			return b;
		} else if ((c > a && c < b) || (c > b && c < a)) {
			return c;
		} else
			return 0;
	}

	public static void main(String[] args) {

		System.out.println(med(5, 4, 2));

	}

}
