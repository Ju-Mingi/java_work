/*배열의 나열 순서를 섞는 (임의의 순서가 되도록 순서를 바꿈) 프로그램을 작성*/
package java_example;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Exam6_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("요소수 : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i<arr.length; i++) {
			System.out.print("a["+i+"] = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("요소를 섞었음");
		for (int x = 0; x < 1000; x++) {
			int rd_num = rd.nextInt(n);
			int tmp = arr[0];
			arr[0] = arr[rd_num];
			arr[rd_num] = tmp;
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("a["+i+"] = "+arr[i]);
		}
		System.out.println("int arr = "+Arrays.toString(arr));

	}

}
