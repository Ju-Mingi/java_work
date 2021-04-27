package java_example;
import java.util.Scanner;

public class Exam3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a<0) {
			System.out.println(a*-1);
		}
		else {
			System.out.println(a);
		}
		sc.close();

	}

}
