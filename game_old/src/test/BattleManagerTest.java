package test;
import main.BattleManager;
import main.Goblin;
import main.Hero;

public class BattleManagerTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BattleManager bm =new BattleManager();
		Hero h = new Hero();
		Goblin g = new Goblin();
		bm.fight(h, g);
	}

}
