package abstractclass.example1;

abstract class A{
	public abstract int b();
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){ System.out.println("hello")}
	//추상 클래스 내에는 추상 메소드가 아닌 메소드에 존재할 수 있다.
	
	public void d() {
		System.out.println("world");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		//A a = new A(); 불가능
		//A obj = new A();
		
	}

}
