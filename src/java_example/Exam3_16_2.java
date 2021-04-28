// 3개 정수 중 중앙값 구하기 2
package java_example;
import java.util.Scanner;
import java.util.Arrays;
public class Exam3_16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums[] = new int[3];
		for(int i = 0; i<3; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[1]);
		sc.close();
	}

}
