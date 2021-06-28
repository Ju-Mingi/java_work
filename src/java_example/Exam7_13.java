package java_example;

import java.util.Scanner;

public class Exam7_13 {
	
	// integer 를 32bit 로 표현
	// 1 -> 00000000 00000000 00000000 00000001
	// 컴퓨터는 이미 인식하고 있음
	
	// 자리마다 1씩 & 연산을 함 <- 32번 반복
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static int set(int x, int pos) {
		return x | (1 << pos);
	}
	
	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}
	
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
		
	}

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int x = stdInt.nextInt();
		int pos = stdInt.nextInt();
		System.out.print("X = ");
		printBits(x);
		System.out.println();
		printBits(set(x, pos));
		System.out.println();
		printBits(reset(x, pos));
		System.out.println();
		printBits(inverse(x, pos));

	}

}
