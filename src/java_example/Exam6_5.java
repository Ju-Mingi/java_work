// 배열의 요소 수 5인 정수형 배열을 5, 4, 3, 2, 1 로 순서대로 초기화해서 표시

package java_example;

public class Exam6_5 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int i;
		for (i = 0; i < 5;) {
			for (int j = 5; j > 0; j--) {
				arr[i] = j;
				System.out.println(arr[i]);
				i++;
			}
		}
	}
}
