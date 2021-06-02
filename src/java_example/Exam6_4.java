
package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 입력 : ");
		int input = sc.nextInt();
		int[] randarr = new int[input];
		for(int i=0; i<input;i++) randarr[i]= (int)(Math.random()*10+1);
		for(int i=10; i>0; i--) {
			for(int j=0;j<input;j++) {
				if(randarr[j]>=i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=============");
		for(int i=0; i<input; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println(Arrays.toString(randarr)+ "요소");
	}
}