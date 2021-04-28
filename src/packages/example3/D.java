package packages.example3;
import packages.example1.*;
import packages.example2.*;
// D 클래스는 packages.exmaple3 에 위치
// import 구문으로 ex1 , ex2 로드

public class D {

	public static void main(String[] args) {
		//B b = new B();
		
		//ex1, ex2 모두 B 클래스를 가지고 있음
		//자바는 ex1 , ex2 의 B 클래스 중 사용하려는 클래스를 모름
		
		packages.example2.B b = new packages.example2.B();
		// 위와 같이 클래스를 명시적으로 지정
		// 또 다른 방법으로는 import 구문에서 .* 이 아닌 B 클래스를 지정하는 방법이 있다.
	}

}
