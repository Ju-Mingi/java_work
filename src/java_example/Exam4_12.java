// 입력받은 양의 정수값을 0까지 카운트하는 프로그램을 작성하시오 (for)
package java_example;
import java.util.Scanner;
public class Exam4_12 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int i = stdInt.nextInt();
		for(i = i; i>=0; i--) {
			System.out.println(i);
		}

	}

}
