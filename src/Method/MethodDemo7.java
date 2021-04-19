package Method;

import java.io.*; // 입출력 패키지

public class MethodDemo7 {
	
	public static String numbering(int init, int limit) {
		int i = init;
		String output ="";
		
		while(i < limit) {
			output += i;
			i++;
			
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);
		System.out.println(result);
		
		try {
			//out.txt 파일에 numbering method 가 반환한 값을 저장
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}
		
		
	}

}
