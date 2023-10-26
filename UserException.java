package com.corejava.exceptions;

class InvalidLoginCredentials extends Exception {

	String username;
	String password;

	public InvalidLoginCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String toString() {
		return "please enter valid login credentials ";

	}
}

public class UserException {

	static void credentials(String username, String password) throws InvalidLoginCredentials {
		if (username != "stella")
			throw new InvalidLoginCredentials(username, password);
		else if (password != "stella123")
			throw new InvalidLoginCredentials(username, password);
		else
			System.out.println("login success");
	}

	public static void main(String[] args) {
		try {
			UserException.credentials("sandy", "sandy123");
		} catch (InvalidLoginCredentials e) {
			System.out.println("enter valid credentials");
		}
	}
}
