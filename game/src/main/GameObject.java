package main;

import java.util.Random;

public abstract class GameObject {
	int y;
	int x;
	String name;
	char suffix;
	
	public GameObject() {};
	public GameObject(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
	}
	
	public void setPosition(Board board) {
		do {
			y = new java.util.Random().nextInt(board.ysize);
			x = new Random().nextInt(board.xsize);
		}while(board.map[y][x] != '.');
		
		board.map[y][x] = suffix;
	}
}
