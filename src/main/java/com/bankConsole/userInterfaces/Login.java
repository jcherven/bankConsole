package com.bankConsole.userInterfaces;

import java.util.Scanner;

public class Login extends Menu{
	private String loginMessage = new String("To get started, please enter your YubiYubi ID.");
	private String promptId = new String("\nYour YubiYubi ID: ");

	public String promptLoginMessage() {

		Scanner sc = new Scanner(System.in);

		this.prompt(loginMessage, promptId);
		String inputId = sc.nextLine();

		sc.close();

		return inputId;

	}

}
