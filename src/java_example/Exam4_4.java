//2 개의 정수 값을 읽어서 두 정수 사이에 있는 모든 정수 값
//작은 수부터 큰 순서로 표시 하는 프로그램

package java_example;
import java.util.Scanner;

public class Exam4_4 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("정수 값 2개 입력");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		if (num1 > num2) {
			int a;
			a = num1;
			num1 = num2;
			num2 = a;	
		}
		
		for(int i = num1+1; i<num2; i++) {
			System.out.print(i+" ");
		}

	}

}
