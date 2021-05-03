// 2자리의 정수값 (0~99)을 맞추는 숫자 맞추기 게임 만들기
package java_example;
import java.util.Scanner;
import java.util.Random;

public class Exam4_3 {

	public static void main(String[] args) {
		
		Scanner  stdInt = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(90)+10;
		System.out.println(answer);
		int my_answer;
		do {
			System.out.println("2자리 정수를 입력하세요.");
			my_answer = stdInt.nextInt();
		
			if(my_answer < answer) {
				System.out.println("더 큰 숫자 입니다.");
				
			}
			else if(my_answer > answer) {
				System.out.println("더 작은 숫자 입니다.");
			}
			
			}while(my_answer != answer);
		System.out.println("정답 입니다.");
		stdInt.close();	
	}

}
