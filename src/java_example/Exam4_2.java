package java_example;
import java.util.Scanner;
public class Exam4_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("백의 자리 정수 값 입력 : ");
			n = s.nextInt();
			if(n<100 || n>=1000) {
				System.out.println("다시 입력하세요");
			}
			else {
				System.out.println("입력한 값 : "+n);
				break;
			}s.close();
		}
	}
}
