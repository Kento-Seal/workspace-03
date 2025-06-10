package rensyu15_1;

public class Main {

	public static void main(String[] args) {
		String s ="";
		for(int i = 1; i < 101; i++) {
			s = s +i + ",";
		}
		System.out.println(s);
		
		String[] a = s.split(",");

		System.out.println(a[4]);
	}

}
