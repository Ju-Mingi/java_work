package java_example;
import java.util.Scanner;
import java.util.Random;
public class Exma6_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rd_idx = 0;
		String KOR_Month[] = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
		String ENG_Month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int choice = 0;
		do {
			rd_idx = rd.nextInt(12);
			System.out.println(KOR_Month[rd_idx]+" 영어는? ");
			String answer = sc.next();
			if(answer.equals(ENG_Month[rd_idx])) {
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
			System.out.print("다시 하시겠습니까? (yes : 1, no : 0) : ");
			choice = sc.nextInt();
		}while(choice == 1);
		
	}
}
