package java_example;
import java.util.Scanner;

public class Scan2_7 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값:");
		int x = sc.nextInt();
		
		System.out.println(x / 10);
		System.out.println(x % 10);
		
		sc.close();
	}
	
}
