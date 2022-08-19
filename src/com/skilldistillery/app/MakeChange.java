package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		price();
		
		System.out.println("Please enter the amount provided by the customer");
		double amount = kb.nextDouble();
		
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
}
