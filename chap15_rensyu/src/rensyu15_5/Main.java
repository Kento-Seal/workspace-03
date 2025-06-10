package rensyu15_5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		LocalDate date = LocalDate.now();
		date = date.plusDays(100);
		String s = date.format(f);
		System.out.println(s);
	}

}
