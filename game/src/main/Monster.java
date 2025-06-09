package main;

import java.util.Random;

public abstract class Monster extends GameObject{
	int power;
	int hp;
	
	public Monster(String name,char suffix) {
		super(name,suffix);
		this.power = 30;
		this.hp = 100;
	}
	
	public void attack(Character c) {
		System.out.println(this.name + "の攻撃!");
		int dmg = new Random().nextInt(this.power) + 1;
		c.hp -= dmg;
		System.out.println(c.name +"に"+ dmg +"ダメージ");
	}
}
