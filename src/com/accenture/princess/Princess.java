package com.accenture.princess;

public class Princess {

	private String princessName;
	private String castle;
	private int gold;
	
	public Princess() {

	}

	public Princess(String princessName, String castle, int gold) {

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
	public void giveGold () {
		this.gold = gold + 10;
	}
	
	public void takeGold () {
		this.gold = gold - 10;
		
	}
	
	public void changeCastleName (String castle) {		
		this.castle = castle;
		
	}
	
	public void losesCastle (){
		if (!hasGold()){
			System.out.println (" The Princess " + princessName + " loses her Castle, the Castle " + castle + " is available for anybody!");
	}
	}

public void attackPrincess (Princess anotherPrincess) {
	
			if (this.hasGold() && anotherPrincess.hasGold()) {
				this.giveGold();
				anotherPrincess.takeGold();
				
			}
			}
}


