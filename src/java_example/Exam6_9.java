// double 형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하기
package java_example;
import java.util.Scanner;
public class Exam6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int input = sc.nextInt();
		double sum = 0;
		double a[] = new double[input];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		System.out.print("합 : "+sum);
		System.out.println();
		System.out.print("평균 : "+sum/input);
		sc.close();
	}

}
