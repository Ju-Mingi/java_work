package java_example;

import java.util.Scanner;


public class exam2_12 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      
      //    i-5    100      i+5
      int k = (int)((Math.random()*11)+(i-5));
      System.out.println(k);

   }

}