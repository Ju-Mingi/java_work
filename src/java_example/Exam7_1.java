package java_example;
import java.util.Scanner;
public class Exam7_1 {

	public static int signOf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a1 = sc.nextInt();
		if (a1 > 0) {
			System.out.println("1");
		} else if (a1 == 0) {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}
		sc.close();
		return a1;
	}

	public static void main(String[] args) {
		signOf();
	}
}
