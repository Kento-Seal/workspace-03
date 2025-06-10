package rensyu15_2;

public class Main {

	public static void main(String[] args) {
		String folder = "c:\\user";
		String file = "readme.txt";
		String fileName="";
		
		if(folder.endsWith("\\")) {
			fileName = folder + file;
			} else {
			fileName = folder + "\\" + file; 
			}
		
		System.out.println(fileName);
		}

}
