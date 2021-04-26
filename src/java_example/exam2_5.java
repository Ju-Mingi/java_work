// 키보드에서 입력한 정수 값을 표시하는 프로그램을 작성하기


package java_example;
import java.util.Scanner;

public class exam2_5 {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i = stdIn.nextInt();
		System.out.println(i);
		stdIn.close();

	}

}
