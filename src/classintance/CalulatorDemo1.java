package classintance;

class Calculator {
	static double PI = 3.14; //static 객체에 따라서 메모리가 변동되지 않음
	int left, right;

	public void setOperands(int left,int right) {
	this.left = left;
	this.right = right;
	}

	public void sum() {
	System.out.println(this.left + this.right);
	}


	public void avg() {
	System.out.println((this.left + this.right)/2);
	}
}

public class CalulatorDemo1 {

	public static void main(String[] args) {
		// 인스턴스를 통해서 PI 에 접근
		Calculator c1 = new Calculator(); // c1 객체 생성
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator(); // c2 객체 생성
		System.out.println(c2.PI);
		// 클래스를 통해서 PI에 접근
		System.out.println(Calculator.PI); // 클래스 자체에 있는 변수명

	}

}
