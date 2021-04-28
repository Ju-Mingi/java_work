package java_example;
import java.util.Scanner;
public class Exam3_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		
		int result1 = (a < b) ? a : b;
		int result2 = c < result1 ? c : result1;
		System.out.println(result2);
		sc.close();
	}

}
