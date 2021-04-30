package java_example;
import java.util.Scanner;
public class Exam3_21 {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int Season = stdInt.nextInt();
		if (Season > 0 && Season < 4) {
			System.out.println("봄");			
		}
		else if(Season >= 4 && Season <= 6) {
			System.out.println("여름");
		}
		else if(Season >= 7 && Season < 10) {
			System.out.println("가을");
		}
		else if(Season >=10 && Season <=12){
			System.out.println("겨울");
		}
		else {
			System.out.println("없어요");
		}

	}

}
