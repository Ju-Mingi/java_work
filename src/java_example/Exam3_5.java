package java_example;
import java.util.Scanner;
public class Exam3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if (a==0) {
			System.out.println("0 입니다.");
		}
		else if (a<0) {
			System.out.println("음수 입니다.");
		}
		else {
			System.out.println("양수 입니다.");
		}
		sc.close();

	}

}
