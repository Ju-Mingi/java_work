/*배열의 요소를 입력받아 특정 값을 가지는 요소를 찾으시오
동일값의 요소가 여러개 잇으면 가장 앞에 위치한 요소를 찾는 프로그램을 작성하시오.*/

package java_example;

import java.util.Scanner;

public class Exam6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int value = sc.nextInt();
		int a[] = new int[value];
		for (int i = 0; i < a.length;) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
			i++;
		}
		System.out.print("찾는 숫자 : ");
		int findnum = sc.nextInt();
		/*for (int i = 0; i < a.length; i++) {
			if (a[i] == findnum) {
				System.out.print("찾는 숫자 : a[" + i + "]에 있습니다.");
				break;
			}*/
		int x = value;
		for (int i = x-1; x >= 0; x--) {
			if (a[i] == findnum) {
				System.out.print("찾는 숫자 : a[" + i + "]에 있습니다.");
				break;
	
		}sc.close();
		}
		
	}
	
}
	
