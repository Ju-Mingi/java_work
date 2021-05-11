// 1부터 입력받은 수 n 까지의 합을 구하는 프로그램을 작성 for
package java_example;
import java.util.Scanner;
public class Exam4_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 n까지의 합 (n 입력) : ");
		int n = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= n; i++) {
			total += i;
			if(i== n) {
				System.out.print(i);	
			}
			else {
				System.out.print(i+" + ");
			}
			
		}System.out.println(" = "+total);
		sc.close();

	}

}
