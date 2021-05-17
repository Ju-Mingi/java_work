// 정수값을 입력받아서 합계와 평균을 구하는 프로그램을 작성하시오. (use for)
// 정수값의 입력은 합계가 1000을 넘지않는 범위에서 이루어지도록 하세요.

package java_example;

import java.util.Scanner;

public class Exam4_27 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int n;
		int i;
		int sum = 0;
		System.out.print("몇개의 정수 값을 더할까요? : ");
		n = stdInt.nextInt();
		for(i = 0; i < n; i++) {
			System.out.print("정수 입력(종료 : 0) : ");
			int t = stdInt.nextInt();
			if(t == 0) {
				break;
			}
			if(sum+t > 1000) {
				System.out.print("1000을 넘었습니다.");
				i++;
				break;
			}
			sum += t;
			}stdInt.close();
		System.out.print("합계 : "+sum);
		System.out.println();
		System.out.print("평균 : "+sum/i);	
		}
}
