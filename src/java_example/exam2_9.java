package java_example;
import java.util.Scanner;

public class exam2_9 {

	public static void main(String[] args) {
		Scanner triangle = new Scanner(System.in);
		System.out.print("밑변 : ");
		int x = triangle.nextInt();
		System.out.print("높이 : ");
		int y = triangle.nextInt();
		
		System.out.println("삼각형의 넓이 :" + (x*y)/2);
		triangle.close();
	}

}
