// 0,1,2 중 하나의 난수를 생성하여 0이면 가위 1이면 바위 2면 보를 표시하는 프로그램
package java_example;
import java.util.Random;
public class Exam3_20 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int bound = 3;
	    int num = rd.nextInt(bound);
	    if (num == 2) {
	    	System.out.println("가위");
	    }
	    else if (num == 1) {
	    	System.out.println("바위");
	    }
	    else {
	    	System.out.println("보");
	    }
	    
	    
	}

}
