package java_example;
import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a < 0) {
			System.out.println("이 값은 음의 값 입니다.");
		}
		else {
			System.out.println("이 값은 양의 값 입니다.");
		}
		sc.close();
		

	}

}
