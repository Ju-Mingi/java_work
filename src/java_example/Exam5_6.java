package java_example;
import java.util.Scanner;
public class Exam5_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double casting_num = sc.nextDouble();
		int x = (int)casting_num;
		System.out.print("강제 형변환 : "+ x);
		sc.close();
	}

}
