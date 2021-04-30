package java_example;
import java.util.Scanner;
public class Exam4_2_nobreak {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("값을 입력하세요 : ");
		n = s.nextInt();
		while(n < 100 || n >= 1000) {
			System.out.print("다시 입력하세요.\n 입력 값 : ");
			n = s.nextInt();
		}
		System.out.println("입력한 값 : "+n);
	}
}