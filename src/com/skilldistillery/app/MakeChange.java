package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		double price = price();
		
		double amount = amount();
		
		lessOrExact(price, amount);
		
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
	
	public static void lessOrExact(double price, double amount) {
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
		System.out.printf("Change due: $%.2f. Result: ", changeAmount);
		
		double numTwenties = changeAmount / 20;		
		
		if (numTwenties > 0) {
			if ((int) numTwenties > 1) {
				System.out.print( (int) numTwenties + " twenty dollar bills, ");
			} else if ((int) numTwenties == 1){
				System.out.print((int) numTwenties + " twenty dollar bill, ");
			}
		}
		
		changeAmount = changeAmount - (20.00 * (int) numTwenties);
//		System.out.printf("$%.2f", changeAmount);
		
		double numTens = changeAmount / 10;		
		
//		if (numTens > 0) {
			if ((int) numTens > 1) {
				System.out.print( (int) numTens + " ten dollar bills, ");
			} else if ((int) numTens == 1) {
				System.out.println((int) numTens + " ten dollar bill, ");
			}
//		} 
		
		changeAmount = changeAmount - (10.00 * (int) numTens);
//		System.out.printf("$%.2f", changeAmount);
		
		double numFives = changeAmount / 5;		
		
//		if (numFives > 0) {
			if ((int) numFives > 1) {
				System.out.print( (int) numFives + " five dollar bills, ");
			} else if ((int) numFives == 1) {
				System.out.println((int) numFives + " five dollar bill, ");
			}
//		} 
		
		changeAmount = changeAmount - (5.00 * (int) numTens);
//		System.out.printf("$%.2f", changeAmount);
	}
}
