package main;

import java.util.Random;

public abstract class Character {
	int y;
	int x;
	String name;
	int hp;
	char suffix = '@';
	int strength = 100;
	
	public Character(String name) {
		this.name = name;
		this.hp = 100;
	}
	/*
	public Character() {
		this.name = "ミゾレ";
		this.hp = 100000000;
	}
	*/
	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃!");
		int dmg = new Random().nextInt(this.strength) + 1;
		m.hp -= dmg;
		System.out.println(m.name +"に"+ dmg +"ダメージ");
	}
	
	public void move(Board board) {
		char ch = Util.choice("WASD >");
		
		switch (ch) {
		case 'W' -> {
			this.y = Math.max(y-1,0);
		}
		case 'A'->{
			this.x = Math.max(x-1, 0);
		}
		case 'S'->{
			this.y= Math.min(y+1, board.ysize);
		}
		case 'D'->{
			this.x= Math.min(x+1, board.xsize);
		}
		}
	}
}
