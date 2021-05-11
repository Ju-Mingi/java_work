package java_example;
import java.util.Scanner;
public class Exam4_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최소 신장 : ");
		int Min_height = sc.nextInt();
		System.out.print("최대 신장 : ");
		int Max_height = sc.nextInt();
		System.out.print("증가 값 : ");
		int step = sc.nextInt();
		System.out.println("신장  |  표준체중");
		System.out.println("--------------");
		for(int i = Min_height; i <= Max_height; i+= step) {
			System.out.println(i + "  |  " + (i - 100) * 0.9);
			
		}sc.close();
	}

}
