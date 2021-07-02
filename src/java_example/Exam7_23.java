package java_example;

import java.util.Arrays;
import java.util.Scanner;

public class Exam7_23 {
	
	static int[] removeArray(int a[], int del_idx) {
		int temp[] = new int[a.length-1];
		for (int i = del_idx; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		for(int i = 0; i < temp.length; i++) {
			temp[i] = a[i];
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 3, 4, 7, 9, 11};
		System.out.print("삭제할 인덱스 번호를 입력 : ");
		int del_idx = sc.nextInt();
		int new_a[] = removeArray(a, del_idx);
		
		System.out.println(Arrays.toString(new_a));
	}

}
