package polymorphism;

class A{
	public String x() {
		return "A.x";
	}
	
}

class B extends A{
	public String x() {
		return "B.X";
	}
	
	public String y() {
		return "y";
	}
}

class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		 A obj = new B();
		 A obj2 = new B2();
		 System.out.println(obj.x());
		 System.out.println(obj2.x());
		 //obj.y(); //obj 변수의 데이터 타입은 A 클래스이다.

	}

}
