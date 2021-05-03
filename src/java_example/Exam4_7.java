// 입력한 개수만큼 "*"을 표시하는 프로그램을 작성
// 마지막에는 줄바꿈 문자를 출력하시오.
package java_example;
import java.util.Scanner;

public class Exam4_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String star = "*";
		System.out.print("별 몇개? ");
		int count = s.nextInt();
		for(int i = 1;  i <= count; i++) {
			if(count > 0) {
				System.out.println(star);
			}
			else {
				System.out.println();
			}
		}

	}
}
