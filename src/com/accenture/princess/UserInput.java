package com.accenture.princess;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

	static String[] princessInCastle = { "Rose castle", "Blue castle",
			"Black castle" };
	static int[] goldMassive = { 100, 100, 100 };
	static ArrayList<String> princessNames = new ArrayList<>();
	static ArrayList<Princess> princess = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println(" Please enter the Princesse's name: ");

			String princessName = scanner.next();
			princessNames.add(princessName);
			Princess p = new Princess(princessName, princessInCastle[i],
					goldMassive[i]);
			princess.add(p);

			System.out.println(" Thank you ! Princess " + princessName
					+ " lives at " + princessInCastle[i]);

			System.out.println();
		}

		System.out
				.println("Each of the Princesses owns 100 of gold. You have an opportunity to add 10 gold to your favorite Princess. Please, choose the favorite Princess and enter her name");

		String princessNameX = scanner.next();

		if (princessNames.contains(princessNameX))

		{
			System.out.println("You have choosen Princess " + princessNameX);

		} else {
			System.out.println("The wrong name, please try once again");

		}

		// for (int i=0; i<princess.size(); i++){
		// if(princess.get(i).getPrincessName().equals(princessNameX)){
		// princess.get(i).giveGold();
		// }
		// }

		
		Princess selectedPrincess = getByName(princessNameX); 
		selectedPrincess.giveGold();
		System.out.println(selectedPrincess);
		
	}
	

	public static Princess getByName(String name) {
		Princess foundPrincess = null;
		for (int i = 0; i < princess.size(); i++) {
			if (princess.get(i).getPrincessName().equals(name)) {
				foundPrincess = princess.get(i);
			}
		}

		return foundPrincess;
	}
}
