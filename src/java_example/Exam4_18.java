// 입력한 정수 값의 모든 약수와 그 개수를 표시하는 프로그램을 작성 for
package java_example;
import java.util.Scanner;
public class Exam4_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.print("n의 약수는? (n 입력) : ");
		int x = sc.nextInt();
		for(int i = 1; i<=x; i++) {
			if(x%i == 0) {
				System.out.println(i);
				cnt ++;
			}
		}sc.close();
		System.out.println("개수 : "+cnt);
	}

}
