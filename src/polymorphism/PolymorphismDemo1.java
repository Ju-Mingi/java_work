package polymorphism;

class A{
	public String x() {
		return "x";
	}
	
}

class B extends A{
	public String y() {
		return "y";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		 A obj = new B();
		 obj.x();
		 //obj.y(); obj 변수의 데이터 타입은 A 클래스이다.

	}

}
