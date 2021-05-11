// 기호 문자를 임의의 개수만큼 출력 for문

package java_example;
import java.util.Scanner;
public class Exam4_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개를 출력할까요 : ");
		int a;
		int i = sc.nextInt();
		
		for(a = 1; a <= i; a++ ) {
			if(a % 2 == 0) {
				System.out.print("+");
			}
			else {
				System.out.print("*");
			}
		}sc.close();
		System.out.println("");
	}

}
