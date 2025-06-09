package rensyu2;

public class Cleric {
	String name;
	int hp = 50;
	final static int MAXHP = 50;
	int mp = 10;
	final static int MAXMP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = Cleric.MAXHP;
		System.out.println("MPを5消費し全回復!残りMP:" + this.mp);
	}
	
	public int pray(int sec) {
		int recov = sec + new java.util.Random().nextInt(3);
		int oldMp = this.mp;
		this.mp += recov;
		if (this.mp > Cleric.MAXMP) {
			this.mp = Cleric.MAXMP;			
		}
		return this.mp - oldMp;
		
	}
	
}