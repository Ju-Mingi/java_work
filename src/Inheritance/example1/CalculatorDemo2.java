package Inheritance.example1;


class MulticationCalculator extends Calculator{
	public void multication() {
		System.out.println(this.left * this.right);
	}
}
public class CalculatorDemo2 {

	public static void main(String[] args) {
		MulticationCalculator c1 = new MulticationCalculator();
		c1.setOperands(10,20);
		c1.sum();
		c1.avg();
		c1.multication();
		

	}

}
