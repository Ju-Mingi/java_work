package io;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "입력값 : ";
		System.out.print("출력값 : ");
		while(sc.hasNextInt()) {
			System.out.print(str);
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();

	}

}

// 한글 인코딩 fix