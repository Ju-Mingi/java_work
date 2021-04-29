// 입력받은 3개의 정수값을 오름차순으로 정렬

package java_example;
import java.util.Scanner;
public class Exam3_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
				
		System.out.println("최소 : " + a);
		System.out.println("중간 : " + b);
		System.out.println("최대 : " + c);
		
	}
}
