// 기호 문자 * 을 나열해서 n 단의 정방향(정사각형)을 표시하는 프로그램 작성

// for 문 사용

/*package java_example;
import java.util.Scanner;
public class Exam4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int i;
		int j;
		for(j = 1; j <= dan; j++) {
			for(i = 1; i<=dan; i++) {
				System.out.print("*");
				}System.out.println();
			}sc.close();
		}
	}
*/

//while 문 사용



package java_example;

import java.util.Scanner;

public class Exam4_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		int i = 1;
		while (i <= (dan - 2) * dan) {
			System.out.print("* ");
			if (i % (dan - 2) == 0) {
				System.out.println();
			}
			i++;
		}
		sc.close();
	}
}
 
 