package java_example;

public class Exam7_6 {
	
	static void printSeason(int m) {
		if (m >= 3 && m <= 5) {
			System.out.println("봄");
		}
		else if (m >= 6 && m <= 8) {
			System.out.println("여름");
		}
		else if (m >= 9 && m <= 11) {
			System.out.println("가을");
		}
		else if (12 == m || m == 2 || m == 1) {
			System.out.println("겨울");
		}
		else {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		printSeason(0);

	}

}
