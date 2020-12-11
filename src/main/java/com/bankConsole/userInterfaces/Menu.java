package com.bankConsole.userInterfaces;

import java.util.Scanner;

public class Menu {
	public String userInput = new String("");
	
	public void displayHeader() {
		System.out.println("YubiYubi Bank Console - enter \"h\" for help");
	}

	public void printDivider() {
		System.out.println("**********************************");
		System.out.println("**************  OK!  *************");
		System.out.println("**********************************");
	}

	/**
	 * displays a simple prompt
	 * @param message
	 * @return
	 */
	public String prompt(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		System.out.print("> ");
		userInput = sc.nextLine();
		sc.close();
		return userInput;
	}
	
	/**
	 * displays a customized prompt
	 * @param message
	 * @param customPrompt
	 * @return
	 */
	public String prompt(String message, String customPrompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		System.out.print(customPrompt + "> ");
		userInput = sc.nextLine();
		sc.close();
		return userInput;
	}
}
