package Inheritance.example1;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
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

class SubtractionalbleCalculator extends Calculator{
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		SubtractionalbleCalculator c1 = new SubtractionalbleCalculator();
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		c1.subtract();
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
		

	}

}
