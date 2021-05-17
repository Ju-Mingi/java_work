package exception;

class A {
	private int[] arr = new int[3];

	A() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}

	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// arr 배열의 크기는 3 , 존재 하지 않는 인덱스 사용시 오류
			System.out.println("ArrayIndexOutOfBoundsException");
			//System.out.println(e.getMessage());
			//e.printStackTrace();

		} catch (ArithmeticException e) {
			// 0 으로 나누었을 경우 에러 발생
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			// 모든 예외를 포괄하는 예외
			// 다른 예외보다 먼저 나오지 않는 것이 최고
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		A a = new A();
		a.z(10, 0);
		a.z(1, 0);
		a.z(2, 1);

	}

}
