package java_example;
import java.util.Scanner;
public class Exam4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		int i = 1;
		int n = sc.nextInt();
		
		while(i <= n) {
			
			factorial = factorial * i;
			i++;
		}sc.close();
		System.out.println("결과 : "+ factorial);

	}

}
