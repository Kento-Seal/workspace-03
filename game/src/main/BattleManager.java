package main;

public class BattleManager {
	public void fight(Character c, Monster m) {
		while(c.hp>0 && m.hp>0) {
			System.out.println(c.name + "HP:" + c.hp);
			char ch = Util.choice("戦う:a  逃げる:r  >");
			if (ch == 'r') break;
			c.attack(m);
			m.attack(c);
		}
		if (c.hp <= 0) {
			System.out.println("死");
		}
		if (m.hp<=0) {
			System.out.println("勝利");
			System.out.println(c.name + "HP:" + c.hp);
		}
	}
}
