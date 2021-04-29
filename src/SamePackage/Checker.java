package SamePackage;
import OtherPackage.*;

class SameClassChecker {
	public SameClassChecker() {
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	private void _private() {
		System.out.println("private");
	}
	
	void _default() {
		System.out.println("default");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	public void _public() {
		System.out.println("public");
	}
	
}
	
class SamePackageChecker extends Same{
	public SamePackageChecker(){
		//같은 패키지
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
		//same._private();
			
		//같은 패키지 상속 관계
		this._public();
		this._protected();
		this._default();
		//this._private();
			
	}
}
	
class OtherPackageChecker extends Other{
	public OtherPackageChecker() {
		//다른 패키지
		Other other = new Other();
		other._public();
		//other._protected();
		//other._default();
		//other._private();
		
		// 다른 클래스, 서브클래스
		this._public();
		this._protected();
		//this._default();
		//this._private();
		
		
		Nothing nothing = new Nothing();
		nothing._public();
//		nothing._protected();
//		nothing._default();
//		nothing._private();
	}
	
}
