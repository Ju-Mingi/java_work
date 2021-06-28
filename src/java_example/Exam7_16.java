package java_example;

import java.util.Scanner;

public class Exam7_16 {
	
	// 배열 요소의 최소값을 구하는 메서드
	static int minOf(int x[]){
		int a_min = x[0];
		for(int i = 0; i <x.length; i++) {
			if(a_min > x[i]) {
				a_min = x[i];
			}
		}
		return a_min;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int peoples = sc.nextInt();
		// 키,체중 배열 각각 하나 씩 생성하기
		int[] height = new int[peoples];
		int[] weight = new int[peoples];
		System.out.println(peoples + "명의 신장과 체중을 입력");
		// 배열[index]의 값을 입력 받음
		for (int i = 0; i < peoples; i++) {
			System.out.print(i+1+"번의 신장 : ");
			height[i] = sc.nextInt();
			System.out.print(i+1+"번의 체중 : ");
			weight[i] = sc.nextInt();	
			}
		System.out.println("가장 키가 작은 사람 신장 : "+minOf(height));
		System.out.println("가장 키가 작은 사람 체중 : "+minOf(weight));
		}
		

	}
