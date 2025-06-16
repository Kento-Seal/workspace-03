package main;

import java.util.ArrayList;
import java.util.Random;

public abstract class Character {
	int y;
	int x;
	int hp;
	String name;
	char suffix;
	ArrayList<Item> itemList;
	
	public Character(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
		this.hp = 100;
		this.itemList  = new ArrayList<Item>();
	}

	public void setPosition(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
	
	public void attack(Monster m) {
		System.out.println(this.name + "は" + m.name + "を攻撃した！");
		int damage = new Random().nextInt(30);
		m.hp -= damage;
		System.out.println(m.name + "に" + damage + "ポイントのダメージを与えた");
		
	}
	
	public void selectAction(Board board) {
		char ch = Util.choice("w↑ s↓ a← d→  u:使う i:情報 l:見る >");
		switch(ch) {
		case 'u' ->{
			useItem();
		}
		case 'w','a','s','d' ->{
			move(ch, board);
		}
		}
	}
	
	
	
	public boolean takeItem(Item item) {
		System.out.println(item.name + "が落ちている");
		char ch = Util.choice("アイテムを拾う? y n >");
		if (ch == 'y') {
			itemList.add(item);
			return true;
		}
		return false;
	}
	
	private void useItem() {
		for(int i = 0; i < itemList.size(); i ++) {
			System.out.println(i + ":" + itemList.get(i).name);
		}
		System.out.println("アイテム番号を選択してください");
		int i = new java.util.Scanner(System.in).nextInt();
		switch(i) {
		//case 0 ->
		}
		
	}
	
	
	private void move(char ch,Board board) {
		switch (ch) {
		case 'w' -> {
			y = Math.max(y-1, 0);
		}
		case 's' -> {
			y = Math.min(y+1, board.ysize-1);
		}
		case 'a' -> {
			x = Math.max(x-1, 0);
		}
		case 'd' -> {
			x = Math.min(x+1, board.xsize-1);
		}
		}
	}
}  // class end
