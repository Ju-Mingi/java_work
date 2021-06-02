package java_example;

public class Exam6_2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i = 0; i <arr.length; i++) {
			arr[i] = arr.length - i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
