package scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding everybody"; // 지역변수로 선언
	}

	public static void main(String[] args) {
		a();
//		System.out.println(title); <- title 은 선언 되지 않은 변수

	}

}
