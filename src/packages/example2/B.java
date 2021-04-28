package packages.example2;
//import packages.example1.*; // import 구문을 이용하여 example1 패키지 명시적 로드
import packages.example1.A; // 모든 패키지를 가져오지 않고 A 클래스만 로드


public class B {

	public static void main(String[] args) {
		// A 클래스가 다른 패키지에 있기 때문에 로드할 수 없음
		A a = new A();
	}

}
