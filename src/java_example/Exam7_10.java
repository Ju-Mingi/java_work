package java_example;

import java.util.Scanner;
import java.util.Random;

public class Exam7_10 {

	static Scanner stdIn = new Scanner(System.in);

	public static boolean Retry() {
		int choice;
		do {
			System.out.print("다시 한번 하시겠습니까? : ");
			choice = stdIn.nextInt();
		} while (choice != 0 && choice != 1);
		return choice == 1;
	}

	public static void main(String[] args) {
		Random rand = new Random();

		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int sign = rand.nextInt(4);
			int ans = 0;

			switch (sign) {
			case 0:
				System.out.print(x + "+" + y + "+" + z + "= ");
				ans = x + y + z;
				break;
			case 1:
				System.out.print(x + "+" + y + "-" + z + "= ");
				ans = x + y - z;
				break;
			case 2:
				System.out.print(x + "-" + y + "+" + z + "= ");
				ans = x - y + z;
				break;
			case 3:
				System.out.print(x + "-" + y + "+-" + z + "= ");
				ans = x - y - z;
				break;
			}
			while (true) {
				int my_ans = stdIn.nextInt();
				if (my_ans == ans) {
					System.out.println("정답!");
					break;
				} else {
					System.out.println("오답!");
				}
			}

		} while (Retry());

	}

}
