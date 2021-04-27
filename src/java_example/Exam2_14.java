package java_example;
import java.util.Scanner;

public class Exam2_14 {
	
	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.print("성 : ");
		String firstname = name.next();
		System.out.print("이름 : ");
		String lastname = name.next();
		
		System.out.println(firstname+lastname+"님 안녕하세요.");

	}

}
