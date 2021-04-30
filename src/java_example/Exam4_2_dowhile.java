package java_example;
import java.util.Scanner;
public class Exam4_2_dowhile {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("세자리 정수 값 입력 : ");
			n = stdInt.nextInt();
		}while(n < 100 || n > 999);
		
		System.out.println("입력한 값은 "+n);

	}

}
