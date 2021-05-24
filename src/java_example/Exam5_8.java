// float 형 변수를 0.0 부터 1.0 까지 0.001씩 증가시키며 표시하고,
// 그 옆에 int형 변수를 0 부터 1000 까지 1 씩 증가시키며 1000 으로 나눈 값을 표시
package java_example;

public class Exam5_8 {

	public static void main(String[] args) {
		System.out.println("float                   int");
		System.out.println("---------------------------");
		int i;
		float x = 0.0F;
		for(i=0; i<=1000; i++) {
			System.out.printf("%9.7f       %9.7f\n",x,(float)i/1000);
			x += 0.001F;
		}
	}

}
