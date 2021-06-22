package java_example;
import java.util.Scanner;
public class Exam7_2 {

	public static int min(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
			if (min > c) {
				min = c;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b 입력 : ");
		int b = sc.nextInt();
		System.out.print("정수 c 입력 : ");
		int c = sc.nextInt();
		System.out.println("최소값은 "+min(a,b,c)+" 입니다.");
	}

}
