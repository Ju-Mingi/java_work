package Method;

import java.util.Arrays;

public class ReturnDemo4 {
	
	public static String[] getMembers() {
		String[] members = {"choijh","choiyb","hanir"};
		return members;
	}

	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(Arrays.toString(members));

	}

}
