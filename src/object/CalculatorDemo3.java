package object;
// 개선이 필요한 예제 클래스
public class CalculatorDemo3 {
	
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
	
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
		
	public static void main(String[] args) {
	int left, right;
	
	left = 10;
	right = 20;
	
	sum(left,right);
	avg(left,right);
	
	left = 20;
	right = 40;
	
	sum(left,right);
	avg(left,right);
	
	
		
	}

}
