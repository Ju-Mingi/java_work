package io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "출력 값 : ";
		System.out.print("값을 입력하세요 : ");
		while(sc.hasNextInt()) {
			System.out.print(str);
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}
