package java_example;

import java.util.Random;
import java.util.Scanner;

public class Exam7_8 {

	static int random(int a, int b) {

		if (b <= a) {
			return a;
		} else {
			Random rd = new Random();
			return rd.nextInt(b + 1 - a) + a;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하한 값 : ");
		int a = sc.nextInt();
		System.out.print("상한 값 : ");
		int b = sc.nextInt();

		int ret = random(a, b);
		System.out.print("생성한 난수는 " + ret);
	}

}
