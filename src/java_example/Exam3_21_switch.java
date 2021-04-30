package java_example;
import java.util.Scanner;
public class Exam3_21_switch {

	public static void main(String[] args) {
		Scanner stdInt = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int Season = stdInt.nextInt();
		
		switch(Season) {
		case 1: case 2: case 3:
			System.out.println("봄");
			break;
		case 4: case 5: case 6:
			System.out.println("여름");
			break;
		case 7: case 8: case 9:
			System.out.println("가을");
			break;
		case 10: case 11: case 12:
			System.out.println("겨울");
			break;
		default :
			System.out.println("없음");
			break;
		}stdInt.close();

	}

}