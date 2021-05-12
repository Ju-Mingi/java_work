// 1부터 n까지 정수값에 각 값을 제곱해서 표시하는 프로그램 작성
package java_example;
import java.util.Scanner;
public class Exam4_19 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		System.out.print("1 ~ n 까지의 제곱의 n 값 : ");
		int n = stdInt.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println(i+"의 제곱은 "+(i*i)+" 입니다.");
		}stdInt.close();
	}
}
