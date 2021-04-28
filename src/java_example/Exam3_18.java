package java_example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class Exam3_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		
		if(a < b) {
			int c = a;
			a = b;
			b = c;
		}
		System.out.println("큰 값: "+a);
		System.out.println("작은 값: "+b);
		sc.close();
	}
}
