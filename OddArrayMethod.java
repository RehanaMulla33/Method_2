package com.xworkz.methods;

public class OddArrayMethod {

	public static void OddNumArray(int listOfNumber[]) {
		int listOfNumber1[] = { 55, 36, 10, 65, 21, 72, 20, 26, 80, 62, 28, 44, 33, 50 };
		for (int i = 0; i <= listOfNumber1.length; i++)
			if (listOfNumber1[i] % 2 != 0)

			{
				System.out.println("Odd Numbers of an Array are " + listOfNumber1[i]);

			}
	}

	public static void main(String[] args) {
		OddArrayMethod.OddNumArray(null);
	}

}
