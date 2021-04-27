package java_example;
import java.util.Scanner;

public class Exam2_10 {

	public static void main(String[] args) {
		Scanner Sphere = new Scanner(System.in);
		
		int r = Sphere.nextInt();
		final double pi = 3.14;
		
		System.out.println("겉넓이 :" + 4*pi*Math.pow(r, 2));
		System.out.println("부피 :" + (4/3)*pi*Math.pow(r, 3));
		Sphere.close();

	}

}
