package java_example;
import java.util.Scanner;
public class Exam3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a<0) {
			System.out.println("음의 정수값을 입력했습니다.");
		}
		
		else if (a%5==0) {
			System.out.println("5로 나누어 떨어집니다.");
		}
		else {
			System.out.println("5로 나누어 떨어지지 않습니다.");
		}
		sc.close();
		

	}

}
