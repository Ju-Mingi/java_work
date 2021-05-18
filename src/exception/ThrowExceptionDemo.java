package exception;

import java.io.*;

class B{
	void run() throws FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(input);
	}
}

class C{
	void run() {
		B b = new B();
		b.run(); // class B 의 예외처리를 받음
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		c.run();

	}

}
