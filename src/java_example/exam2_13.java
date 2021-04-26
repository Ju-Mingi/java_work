package java_example;
import java.util.Random;
public class exam2_13 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      double nansu1 = Math.random();
	      double nansu2 = Math.random()*10;
	      double nansu3 = Math.random()*2-1;
	      
	      System.out.println(nansu1);
	      System.out.println(nansu2);
	      System.out.println(nansu3);
	      
	      Random r = new Random();
	      
	      double r1 = r.nextDouble();
	      double r2 = r.nextDouble()*10;
	      double r3 = r.nextDouble()*2-1;
	      

	      System.out.println("+++++++++++++++++++++");

	      System.out.println(r1);
	      System.out.println(r2);
	      System.out.println(r3);
	     
	   }
}
		

