// 배열 a의 요소 a[idx]에 x를 삽입하는 insertArray() 메서드 작성
// 삽입 시에는 a[idx] ~ a[a.length - 2]를 하나씩 뒤로 이동


package java_example;

import java.util.Scanner;

public class Exam7_20 {
	
	
	static void insertArray(int a[], int idx, int value) {
		for(int i= a.length-1; i > idx ; i--) {
			a[i] = a[i-1];
		}
		a[idx] = value;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("추가할 요소의 인덱스 : ");
		int idx = sc.nextInt();
		System.out.println("추가할 인덱스의 요소 값 : ");
		int value = sc.nextInt();
		insertArray(a,idx,value);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

}
