package java_example;
import java.util.Scanner;
public class Exam6_7 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("사람 수 : ");
		
		int peoples = stdIn.nextInt();
		
		int point[] = new int[peoples];
		
		int sum = 0;
		
		double avg = 0.0;
		
		int max = point[0];
		int min = 100;
		
		for (int i = 0; i < point.length; i++) {
			System.out.print(i+1+"번 점수 : ");
			point[i] = stdIn.nextInt();
			
			sum += point[i];
			
			if(max < point[i]) {
				max = point[i];
			}
			if(point[i] < min ) {
				min = point[i];
			}
			 
		}
		avg = (double) sum/point.length;
		System.out.println("합계 : " + sum +"점");
		System.out.println("평균 : " + avg +"점");
		System.out.println("최고점 : "+ max +"점");
		System.out.println("최저점 : "+ min +"점");

	}

}
