package java_example;
import java.util.Scanner;
public class Exam4_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String star = "*";
		String plus = "+";
		
		System.out.println("정수를 입력해주세요.");
		int stdInt = sc.nextInt();
		for(int i=1; i<=stdInt; i++) {
			if(i%2==0) {
				System.out.print(star);
			}
			else {
				System.out.print(plus);
			}sc.close();
		}System.out.println();

	}
}
