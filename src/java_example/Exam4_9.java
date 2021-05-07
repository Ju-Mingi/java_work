// 양의 정수값을 읽어서 그 자리수를 출력하는 프로그램을 작성하시오.
package java_example;
import java.util.Scanner;
public class Exam4_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		int stdInt = sc.nextInt();
		int state=0;
		while(stdInt > 0) {
			state++;
			stdInt = stdInt /10;
		}
		System.out.println(state);
		sc.close();
//		while(0 > stdInt) {
//			System.out.println("양의 정수를 입력하세요.");
//			stdInt = sc.nextInt();
//			}
//		while(0 < stdInt) {
//			String position = Integer.toString(stdInt);
//			System.out.println("자리수 : "+position.length());
//			break;
//		}sc.close();

	}

}
