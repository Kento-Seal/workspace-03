package p543;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "アザラシさん";
		char[] data1 = str.toCharArray();
		byte[] data2 = str.getBytes("utf-8");
		byte[] data3 = str.getBytes();
		
		for (int i = 0; i<10; i++) {
			System.out.println(data1[i]);
			System.out.println(data2[i]);
			System.out.println(data3[i]);
		}
	}

}
