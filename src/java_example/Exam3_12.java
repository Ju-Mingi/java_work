package java_example;
import java.util.Scanner;
public class Exam3_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double max = a > b ? a : b;
		System.out.println("둘 중에 큰 값은 "+max);
		sc.close();

	}

}
