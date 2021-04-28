package java_example;
import java.util.Scanner;
public class Exam3_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 ");
		int a = sc.nextInt();
		System.out.print("정수 값을 입력하세요 ");
		int b = sc.nextInt();
		int Sub = a - b;
		if (Sub < 0) {
			Sub = Sub*-1;	
		}
		System.out.println("두 값의 차는 "+Sub);
	}
}
