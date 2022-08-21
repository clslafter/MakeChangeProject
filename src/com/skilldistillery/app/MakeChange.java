package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		double price = price();

		double amount = amount();

		assessAmount(price, amount);

		kb.close();

	}

	public static double price() {
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the price of the item");
		double price = kb.nextDouble();
		return price;
	}

	public static double amount() {
		Scanner kb = new Scanner(System.in);

		System.out.println("Please enter the amount provided by the customer");
		double amount = kb.nextDouble();
		return amount;
	}

	public static void assessAmount(double price, double amount) {
		if (amount == price) {
			System.out.println("Exact amount. No change due");
		} else if (amount < price) {
			double needMore = price - amount;
			System.out.printf("Insufficient amount. Request at least $%.2f more.", needMore);
		} else {
			makeChange(price, amount);
		}
	}

	private static void makeChange(double price, double amount) {
		// TODO Auto-generated method stub
		double changeAmount = amount - price;
		System.out.printf("Change due: $%.2f. Return: \n", changeAmount);

		double numTwenties = changeAmount / 20;

		if ((int) numTwenties > 1) {
			System.out.println((int) numTwenties + " twenty dollar bills ");
		} else if ((int) numTwenties == 1) {
			System.out.println((int) numTwenties + " twenty dollar bill ");
		}

		changeAmount = changeAmount - (20.00 * (int) numTwenties);
//		System.out.printf("\n $%.2f", changeAmount);

		double numTens = changeAmount / 10;

		if ((int) numTens > 1) {
			System.out.println((int) numTens + " ten dollar bills ");
		} else if ((int) numTens == 1) {
			System.out.println((int) numTens + " ten dollar bill ");
		}

		changeAmount = changeAmount - (10.00 * (int) numTens);
//		System.out.printf("\n $%.2f", changeAmount);

		double numFives = changeAmount / 5;

		if ((int) numFives > 1) {
			System.out.println((int) numFives + " five dollar bills ");
		} else if ((int) numFives == 1) {
			System.out.println((int) numFives + " five dollar bill ");
		}

		changeAmount = changeAmount - (5.00 * (int) numFives);
//		System.out.printf("\n $%.2f", changeAmount);

		double numOnes = changeAmount / 1;

		if ((int) numOnes > 1) {
			System.out.println((int) numOnes + " one dollar bills ");
		} else if ((int) numOnes == 1) {
			System.out.println((int) numOnes + " one dollar bill ");
		}

		changeAmount = changeAmount - (1.00 * (int) numOnes);
//		 System.out.printf("\n $%.2f", changeAmount);

		double numQuarters = changeAmount / 0.25;

		if ((int) numQuarters > 1) {
			System.out.println((int) numQuarters + " quarters ");
		} else if ((int) numQuarters == 1) {
			System.out.println((int) numQuarters + " quarter ");
		}

		changeAmount = changeAmount - (0.25 * (int) numQuarters);
//			 System.out.printf("\n $%.2f", changeAmount);

		double numDimes = changeAmount / 0.10 + 0.00000000000001;

		if ((int) numDimes > 1) {
			System.out.println((int) numDimes + " dimes ");
		} else if ((int) numDimes == 1) {
			System.out.println((int) numDimes + " dime ");
		}

		changeAmount = changeAmount - (0.10 * (int) numDimes);
//			 System.out.printf("\n $%.2f", changeAmount);

		double numNickels = (changeAmount / 0.05) + 0.001;
//			 System.out.println("\n" + numNickels);

		if ((int) numNickels > 1) {
			System.out.println((int) numNickels + " nickels ");
		} else if ((int) numNickels == 1) {
			System.out.println((int) numNickels + " nickel ");
		}

		changeAmount = changeAmount - (0.05 * (int) numNickels);
//				 System.out.printf("\n $%.2f", changeAmount);

		double numPennies = (changeAmount / 0.01) + 0.0001;
//				 System.out.println("\n" + numPennies);

		if ((int) numPennies > 1) {
			System.out.println((int) numPennies + " pennies. ");
		} else if ((int) numPennies == 1) {
			System.out.println((int) numPennies + " penny. ");
		}

		changeAmount = changeAmount - (0.01 * (int) numPennies);
//					 System.out.printf("\n $%.2f", changeAmount);
	}
}
