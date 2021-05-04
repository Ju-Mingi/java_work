package OtherPackage;

public class Other {
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

	public static void main(String[] args) {
		Other other = new Other();
		other._private();
		other._default();
		other._protected();
		other._public();

	}

}
