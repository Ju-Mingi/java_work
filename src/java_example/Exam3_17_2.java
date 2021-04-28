package java_example;
import java.util.Scanner;
import java.util.Arrays;
public class Exam3_17_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		for(int i=0; i<2; i++) {
			
			System.out.print("정수를 입력해주세요 : ");
			arr[i] = sc.nextInt();
			
		}
		Arrays.sort(arr);
		if(arr[0]==arr[1]) {
			System.out.println("값이 동일합니다.");
		}
		else {
			System.out.println("작은 값: "+arr[0]);
			System.out.println("큰 값: "+arr[1]);
		}
		
	}

}