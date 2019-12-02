package com.accenture.princess;

public class PrincessApp {

	public static void main(String[] args) {

		Princess anna = new Princess("Anna", "Anna' s castle", 20);

		System.out.println(anna);

		anna.giveGold();

		System.out.println(anna);

		System.out.println(anna);

		Princess martha = new Princess("Martha", "Martha' s castle", 10);

		System.out.println(martha);

		anna.changeCastleName("Anna's Castle");

		System.out.println(anna);

		anna.attackPrincess(martha);

		System.out.println("after the fight");

		System.out.println(anna);

		System.out.println(martha);

		anna.changeCastle(martha);

		System.out.println(anna);

		System.out.println(martha);

		// martha.losesCastle();
		// System.out.println(anna);

		System.out.println(anna);
		System.out.println(martha);
		for (int i = 0; i < 10; i++) {
			anna.giveGold();
		}

		for (int i = 0; i < 12; i++) {
			martha.giveGold();
		}

		anna.saleCastle(martha);
		System.out.println(anna);
		System.out.println(martha);
	}
}
