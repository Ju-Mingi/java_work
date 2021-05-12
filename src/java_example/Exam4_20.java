// 달(월)을 정수값으로 입력받아서 해당하는 달의 계절을 표시하는 프로그램을 작성하시오.
package java_example;
import java.util.Scanner;
public class Exam4_20 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int month;
		int retry = 0;
		do {
			System.out.print("월 입력 :");
			month = stdInt.nextInt();
			if(1<= month && month <=3) {
				System.out.println("봄 입니다.");
			}
			else if(4<= month && month <=6) {
				System.out.println("여름 입니다.");
			}
			else if(7<= month && month <=9) {
				System.out.println("가을 입니다.");
			}
			else if(10<= month && month <=12) {
				System.out.println("겨울 입니다.");
			}
			System.out.println("\n다시 하실? Yes : 1 , No : 0");
			retry = stdInt.nextInt();
		}
		while(retry == 1);
		}
	}
