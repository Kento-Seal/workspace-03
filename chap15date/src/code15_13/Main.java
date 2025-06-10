package code15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = f.parse("2025/08/07 12:34:56");
		System.out.println(d);
		Date now = new Date();
		String s = f.format(now);
		System.out.println(s);
	}

}
