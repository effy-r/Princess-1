package com.accenture.princess;

public class Princess {

	protected String princessName;
	protected String castle;
	private int gold;
	
	
	
	public Princess() {

	}

	public Princess(String princessName, String castle, int gold) {
		this.princessName = princessName;
		this.castle = castle;
		this.gold = gold;
	
//	public Princess(String princessName, String castle, int gold) {
//		this.princessName = princessName;
//		this.castle = castle;
//		this.gold = gold;

	}

	public String getPrincessName() {
		return princessName;
	}

	public String getCastle() {
		return castle;
	}

	public int getGold() {
		return gold;
	}

	public boolean hasGold() {

		if (gold > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void giveGold() {
		this.gold = gold + 10;
	}

	public void takeGold() {
		this.gold = gold - 10;

	}

	public void changeCastleName(String castle) {
		this.castle = castle;

	}

	public void losesCastle() {
		if (!hasGold()) {
			System.out.println(" The Princess " + princessName
					+ " loses her Castle, the Castle " + castle
					+ " is available for anybody!");
		}
	}

	public void attackPrincess(Princess anotherPrincess) {

		if (this.hasGold() && anotherPrincess.hasGold()) {
			this.giveGold();
			anotherPrincess.takeGold();

		}

		else {

			System.out
					.println("One of the Princeses has no gold and the deal is not possible!");

		}

	}

	public void changeCastle(Princess anotherPrincess) {

		String castle1 = this.castle;
		this.castle = anotherPrincess.castle;
		anotherPrincess.castle = castle1;

	}

	public void saleCastle(Princess anotherPrincess) {

		if (anotherPrincess.gold > 100) {
			String castle1 = this.castle;
			anotherPrincess.gold = anotherPrincess.gold - 100;
			anotherPrincess.castle = castle1;
			this.castle = "no castle";
			this.gold = this.gold + 100;
			System.out.println("Princess " + anotherPrincess.princessName
					+ " has bougth the " + castle1 + " from Princess "
					+ princessName);

		} else {
			System.out.println("Princess " + anotherPrincess.princessName
					+ " doesn't have enough gold to buy the castle!");

		}

	}

	public String toString() {
		if (castle != "no castle") {

			return "Princess " + princessName + " lives at " + castle
					+ ". She has " + gold + " gold ";

		} else {

			return "Princess " + princessName + " doesn't own any castle "
					+ ". She has " + gold + " gold ";
		}
	}

}
