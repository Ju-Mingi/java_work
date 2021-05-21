package exception;

import java.io.*;

class B {
	void run() throws FileNotFoundException, IOException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		
		/*
		 * try { bReader = new BufferedReader(new FileReader("out.txt")); } catch
		 * (FileNotFoundException e) { e.printStackTrace(); }
		 * 
		 * try { input = bReader.readLine(); } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException {
		B b = new B();
		b.run();
		/*
		 * try { b.run(); // class B 의 예외처리를 받음 } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } catch(IOException e) { e.printStackTrace(); }
		 */
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		}catch(FileNotFoundException e) {
			System.out.println("out.txt 파일이 필요합니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
