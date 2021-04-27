package java_example;
import java.util.Scanner;
public class Exam3_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a 값");
		int a = sc.nextInt();
		System.out.println("b 값");
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println(a+"가 "+b+"보다 크다.");
		}
		else if (a<b){
			System.out.println(b+"가 "+a+"보다 크다.");
		}
		else if (a==b){
			System.out.println(a+"와 "+b+"가 같다.");
		}
		
		

	}

}
