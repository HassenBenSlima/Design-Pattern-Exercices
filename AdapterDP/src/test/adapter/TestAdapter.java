package test.adapter;

import adapter.Duck;
import adapter.MallardDuck;
import adapter.TurkeyAdapter;
import adapter.WildTurkey;

public class TestAdapter {

	public static void main(String arg[]) {
		
		MallardDuck mallard = new MallardDuck();
		
		WildTurkey wild = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wild);
		
		Duck tab[] = new Duck[2];
		tab[0] = mallard;
		tab[1] = turkeyAdapter;
		
		for (int i = 0; i < 2; i++) {
			tab[i].quack();
			tab[i].fly();
		}

	}
}