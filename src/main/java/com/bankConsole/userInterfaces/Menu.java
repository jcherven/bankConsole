package com.bankConsole.userInterfaces;

import java.util.Scanner;

public class Menu {
	public int userSelection = 0;
	
	public void displayHeader() {
		System.out.println("YubiYubi Bank Console - enter \"h\" for help");
	}
	
	public int prompt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		userSelection = sc.nextInt();
		sc.close();
		return userSelection;
	}
	
}
