package java_example;
import java.util.Scanner;
public class Exam4_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}sc.close();
		
	}
	
}

