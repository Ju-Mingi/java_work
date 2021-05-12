//입력한 개수만큼 '*'을 표시하는 문제를 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성
package java_example;
import java.util.Scanner;
public class Exam4_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력해주세요 :");
		int x = sc.nextInt();
		String star = "*";
		for(int i = 1; i<=x; i++) {
			System.out.print(star);
			if(i%5 ==0) {
				System.out.println();
			}
		}sc.close();

	}

}
