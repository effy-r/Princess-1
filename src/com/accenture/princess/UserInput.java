package com.accenture.princess;

import java.util.Scanner;


public class UserInput {
	
	static String [] princessInCastle = {"Rose castle", "Blue castle", "Black castle"};
	
	static String castle = princessInCastle[0];
	static String castle1 = princessInCastle[1];
	static String castle2 = princessInCastle[2];

	public static void main(String[] args) {

		System.out.println(" Please enter the first Princesse's name: ");

		Scanner scanner = new Scanner(System.in);
		String princessName = scanner.next();
		
		System.out.println(" Thank you ! Princess " + princessName + " lives at " + castle);
		
		System.out.println(" Please enter the second Princesse's name: ");

		Scanner scanner1 = new Scanner(System.in);
		String princessName1 = scanner.next();
		
		System.out.println(" Thank you ! Princess " + princessName1 + " lives at " + castle1);
		
		System.out.println(" Please enter the third Princesse's name: ");

		Scanner scanner2 = new Scanner(System.in);
		String princessName2 = scanner.next();
		
		System.out.println(" Thank you ! Princess " + princessName2 + " lives at " + castle2);
	}
	}

