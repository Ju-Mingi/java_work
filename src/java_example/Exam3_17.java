package java_example;
import java.util.Scanner;
public class Exam3_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println("두 정수 중 큰 값 : "+a);
			System.out.println("두 정수 중 작은 값 : "+b);
		}
		else if(a < b) {
			System.out.println("두 정수 중 큰 값 : "+b);
			System.out.println("두 정수 중 작은 값 : "+b);
		}
		else {
			System.out.println("두 값이 동일합니다.");
		}
		
	}

}
