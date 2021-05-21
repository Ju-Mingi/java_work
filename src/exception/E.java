package exception;

import java.io.IOException;

public class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	
	void throwIOException1() {
		try {
			throw new IOException();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	void throwIOException2() throws IOException{
		//Throws 현재 method 에서 상위 method로 예외를 던짐
		throw new IOException();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
