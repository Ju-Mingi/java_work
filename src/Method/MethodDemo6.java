package Method;

public class MethodDemo6 {
	public static String numbering(int init, int limit) {
		int i = init;
		//��������� ���ڸ� output �̶�� ������ ��� ���� ������ �� ���� �־���.
		String output = "";
		while(i<limit) {
			// ���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			output += i;
			i++;
		}
		// output�� ��� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� return Ű���� �ڿ� ��ȯ�Ϸ��� ���� ��ġ
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// numbering method���� ������ ���� result ������ ����.
		String result = numbering(1,5);
		//result ������ ���� ȭ�鿡 ���
		System.out.println(result);
	}

}
