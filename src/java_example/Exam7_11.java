/*정수를 좌우로 시프트한 값이, '정수 *2의 거듭제곱' 및 '정수 /2의 거듭 제곱'과 같은지 확인하는 프로그램 작성*/

package java_example;

import java.util.Scanner;

public class Exam7_11 {
	
	
	public static int pow2(int n) {
		int result = 2;
		for (int i = 1; i < n; i++) {
			result *= 2; 
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 x 를 n 비트 시프트 합니다.");
		System.out.print("x : ");
		int x = stdIn.nextInt();
		System.out.print("n : ");
		int n = stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int shiftLeft = x << n;
		int shiftRight = x >> n;
		
		if (mPower == shiftLeft) {
			System.out.print("a 와 c 값이 일치합니다.");
			System.out.println();
		}
		if (dPower == shiftRight) {
			System.out.print("b 와 d 값이 일치합니다.");
		}
	}

}
