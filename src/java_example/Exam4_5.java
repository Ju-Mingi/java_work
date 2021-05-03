// 입력 받은 정수값부터 0까지 카운트다운하는 프로그램을 작성하라.
// 카운트다운 종료 후의 변수값을 확인할 수 있도록 프로그램 만들기
package java_example;
import java.util.Scanner;

public class Exam4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("정수 값을 입력하세요.");
			a = sc.nextInt();
		}while (a <= 0);
		
		while(a >= 0)
			System.out.println(a--);
			System.out.println("a 값 : "+a);
	}
}
