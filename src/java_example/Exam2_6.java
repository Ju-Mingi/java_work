// 키보드에서 입력한 정수 값에 10을 더한 값과 10을 뺀 값을 출력하기
package java_example;
import java.util.Scanner;

public class Exam2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int x = sc.nextInt();
		System.out.println(x + 10);
		System.out.println(x - 10);
		sc.close();
		

	}

}
