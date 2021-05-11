package exception;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.print(" 입니다.");
		} catch(Exception e) {
			//System.out.println("오류가 발생했습니다 : "+e.getMessage());
			System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			//System.out.println("\n\ne.toString()\n"+e.toString());
			//System.out.println("\n\ne.pribtStackTrace()");
			//e/.printStackTrace();
		}
		System.out.println("Divide End");
		
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.divide();

	}

}
