// 문자를 입력받고 단 수 만큼 출력하기
package java_example;

import java.util.Scanner;

public class Exam7_7 {

	static void putChar(int n,char x) {
			for (int i = 0; i < n; i++) {
				System.out.print(x);
			}
	}
	
	static void putStart(int n, char x) {
			putChar(n,x);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 문자를 출력할까요? : ");
		char x = sc.next().charAt(0);
		System.out.print("몇 단 ? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			putStart(i,x);
			System.out.println();
		}
		
	}

}
