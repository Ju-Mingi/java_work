package Method;

import java.io.*; // ����� ��Ű��

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
			//out.txt ���Ͽ� numbering method �� ��ȯ�� ���� ����
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}
		
		
	}

}
