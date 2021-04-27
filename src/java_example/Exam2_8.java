package java_example;
import java.util.Scanner;

public class Exam2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 값을 입력하세요 : ");
		double x = sc.nextDouble();
		System.out.print("또 다른 실수 값을 입력하세요 : ");
		double y = sc.nextDouble();
		System.out.println(x + y);
		System.out.println((x + y) / 2);
		
		sc.close();
	}

}
