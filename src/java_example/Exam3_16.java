// 3개 정수 중 중앙값 구하기
package java_example;
import java.util.Scanner;


class Median{
	static int median3(int a, int b, int c) {
		if (a >= b) {
            if (b >= c) {
                return b;
            }
            else if (a <= c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if (a > c) {
            return a;
        }
        else if (b > c) {
            return c;
        }
        else {
            return b;
        }
	}
}

public class Exam3_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		System.out.print("c : ");
		int c = sc.nextInt();

		System.out.println("중앙 값 : "+Median.median3(a, b, c));
		sc.close();
	}

}
