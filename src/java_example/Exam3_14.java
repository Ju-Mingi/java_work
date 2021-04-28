package java_example;
import java.util.Scanner;
public class Exam3_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		int Sub = a - b;
		if (Sub < 0) {
			Sub*= -1;
		}
		String result = (Sub>=10) ? "두 값의 차는 11 이상" : "두 값의 차는 10 이하";
		System.out.println(result);
		sc.close();
	}

}
