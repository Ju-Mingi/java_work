package java_example;
import java.util.Random;
public class Scan2_11 {
	public static void main(String[] args)  {
        Random random = new Random();
        
        int n1 = 1 + random.nextInt(9);
        int n2 = -1 - random.nextInt(9);
        int n3 = 1 + random.nextInt(90);
        
        System.out.println("한 자리 양의 정수 : " + n1);
        System.out.println("한 자리 음의 정수 : " + n2);
        System.out.println("두 자리 양의 정수 : " + n3);
    }
}
