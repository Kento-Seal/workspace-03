package rensyu15_4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DATE);
		day = day + 100;
		c.set(Calendar.DATE, day);
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(d);
		
		System.out.println(s);
	}

}
