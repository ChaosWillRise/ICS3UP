package Ayuso;

import java.util.Scanner;
/**
 * Factorial.java
 * Asks the user for a number, factorializes the number, and prints it to the system console.
 * April 5/2017
 * @author Ian Ayuso
 */

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number to be factorialized");
		int factorialNumber = scan.nextInt();
		long factorialedNumber = factorial(factorialNumber);
		System.out.println(factorialedNumber);


	}

	/**
	 * Sends a number to this method to be factorialized.
	 * @param num - This is the number that is being factorialed.
	 * @return Returns the factorial of num.
	 */
	public static long factorial(int num){
		long x = 1;
		if (num == 0){
			x = 1;
			return x;
		}
		for (int i = num; i > 0; i--){
			x = x*i;
		}
		return x;
	}

}
