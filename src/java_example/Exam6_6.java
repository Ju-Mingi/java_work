
package java_example;
import java.util.Scanner;
public class Exam6_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요소 수: ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a={");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if (i == a.length - 1) {
				System.out.print("");
			}
			else
			System.out.print(", ");
		}
		System.out.print("}");
		
		

	}

}