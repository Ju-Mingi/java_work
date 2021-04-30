package java_example;
import java.util.Scanner;
public class Exam4_1 {
	
	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		Scanner select = new Scanner(System.in);
		while(true) {
			System.out.println("정수 값을 입력해주세요.");
			int num = stdInt.nextInt();
			if (num < 0) {
				System.out.println("이 값은 음수 입니다.");
			}
			else {
				System.out.println("이 값은 양수 입니다.");
	
			}
			System.out.println("다시 하시겠습니까? yes : 1 no : 0");
			int choice = select.nextInt();
			switch(choice) {
			case 0:
				break;
			case 1:
				continue;
			}stdInt.close();
			select.close();				
		}	
	}

}
