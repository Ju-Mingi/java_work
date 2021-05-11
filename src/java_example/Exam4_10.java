package java_example;
import java.util.Scanner;
public class Exam4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 1;
		while(input > 0 ) {
		   i *= input;
		   input--;
		}
		System.out.println(i);
		sc.close();
	}

}
