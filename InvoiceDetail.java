package com.xworkz.methods;

public class InvoiceDetail {
	public static int dermaBillPayment(int price, int quantity) {
		int totalBillPrice = price * quantity;
		return totalBillPrice;
	}

	public static void main(String[] args) {
		int price = 369;
		int quantity = 6;
		int totalPrice = InvoiceDetail.dermaBillPayment(price, quantity);
		{
			System.out.println(" The Total price Of Derma is" + totalPrice);
		}

	}

}
