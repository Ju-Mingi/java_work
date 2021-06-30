//키와 같은 값을 찾는 메서드 만들기

package java_example;

import java.util.Scanner;

public class Exam7_17 {
    
	// 가장 앞에 위치한 값 찾기
	static int linearSearch(int a[], int key) {
		int find_idx = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				find_idx = i;
				break;
			}
		}
		return find_idx;
	}
	
	// 가장 뒤에 위치한 값 찾기
	static int linearSearchR(int a[], int key) {
		int find_idx = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				find_idx = i;
				break;
			}
		}
		return find_idx;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 입력 : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int key = sc.nextInt();

		System.out.println("가장 앞에 위치한 값은 a[" + linearSearch(a, key) + "]에 있습니다.");
		System.out.println("가장 뒤에 위치한 값은 a[" + linearSearchR(a, key) + "]에 있습니다.");
	}

}
