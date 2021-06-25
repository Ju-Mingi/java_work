/*정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 roateRight 메서드와
왼쪽으로 n비트 회전한 값을 반환하는 rotateLeft 메서드를 작성*/

package java_example;

import java.util.Scanner;

public class Exam7_12 {
	
    static void printBits(int x) {
		for(int i =31; i >=0; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	}
	
	static int rotateRight(int x, int n) {
		if(n < 0) {
			return rotateLeft(x, -n);
		}
		int ret;
		n = n % 32;
		ret = (n == 0 ? x : (x >>> n) | (x << (32 - n)));
		return ret;
	}
	
	static int rotateLeft(int x, int n) {
		if(n < 0) {
			return rotateRight(x, -n);
		}
		int ret;
		n = n % 32;
		ret = (n == 0 ? x : (x << n) | (x >>> (32 - n)));
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("x : ");
		int x = stdIn.nextInt();
		System.out.print("n : ");
		int n = stdIn.nextInt();
		System.out.println("회전 전 = ");
		printBits(x);
		System.out.println("\n오른쪽 회전 = ");
		printBits(rotateRight(x, n));
		System.out.println("\n왼쪽 회전 = ");
		printBits(rotateLeft(x, n));
	}

}
