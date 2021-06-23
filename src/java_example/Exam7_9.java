/*"양의 정수값:" 이라는 메세지에 정수값을 입력하면 값을 거꾸로 반환하는 readPlusInt 메서드를 작성
 * 0이나 음수가 입력되면 재입력하도록 할 것*/
package java_example;
import java.util.Scanner;
public class Exam7_9 {
	
	public static void readPlusInt() {
		int restart = 1;
		do {
			Scanner stdInt = new Scanner(System.in);
			System.out.print("양의 정수 값 : ");
			String n;
			String[] array_n;                           
			n = stdInt.next();
			array_n = n.split("");
			int len = array_n.length; 
			for(int i = len-1; i >= 0; i--) {
				System.out.print(array_n[i]);
			}
			System.out.println();
			System.out.println("다시 고? (yes : 1 / no : 0): ");
			restart = stdInt.nextInt();
		}while(restart == 1);
		
	}
	
	public static void main(String[] args) {
		readPlusInt();
	}

}
