package com.xworkz.methods;

public class GoogleMail {
	public static void gMailLogin(String GM, int pwd) {
		String gMailAccnt="abc123@gmail.com";
		int password=123000123;
		if(gMailAccnt==GM && password==pwd) {
	System.out.println("Login successfully");
	}
		else {
			System.out.println("Unsuccessful Login");
		}
	}
	public static void messageDelivered() {
		System.out.println("message has been delivered to the recepient");
	}
	public static void main(String[] args) {
		GoogleMail.gMailLogin("abc123@gmail.com", 123000123);
		GoogleMail.messageDelivered();

	}

}
