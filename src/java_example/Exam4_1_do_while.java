package java_example;
import java.util.Scanner;
public class Exam4_1_do_while {
	
	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		int retry;
		do {
			System.out.println("정수 값을 입력해주세요.");
			int num = stdInt.nextInt();
			if (num < 0) 
				System.out.println("음수 입니다.");
			else if(num > 0)
				System.out.println("양수 입니다.");
			System.out.println("다시 한번 하시겠습니까? yes : 1 no : 0");
			retry = stdInt.nextInt();
		}while(retry == 1);
		stdInt.close();
	}
	
}

					
