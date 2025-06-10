package code15_12;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2025,7,7,0,0,0);
		c.set(Calendar.HOUR, 10);
		Date d = c.getTime();
		System.out.println(d);
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println(y);

	}

}
