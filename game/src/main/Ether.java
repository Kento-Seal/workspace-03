package main;

public class Ether extends Item{
	int recovMp;
	
	public Ether(String name, char suffix) {
		super(name, suffix);
		// TODO 自動生成されたコンストラクター・スタブ
		this.recovMp = 50;
	}
	
	public Ether() {
		this("エーテル", 'e');
	}

}
