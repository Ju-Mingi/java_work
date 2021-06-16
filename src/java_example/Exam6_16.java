package java_example;
import java.util.Scanner;
import java.util.Random;
public class Exam6_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rd_idx = 0;
		String KOR_DOW[] = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		String ENG_DOW[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int choice = 0;
		do {
			rd_idx = rd.nextInt(7);
			System.out.println(KOR_DOW[rd_idx]+" 영어는? ");
			String answer = sc.next();
			if(answer.equals(ENG_DOW[rd_idx])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
			System.out.print("다시 하시겠습니까? (yes : 1, no : 0) : ");
			choice = sc.nextInt();
		}while(choice == 1);
		
	}
}
