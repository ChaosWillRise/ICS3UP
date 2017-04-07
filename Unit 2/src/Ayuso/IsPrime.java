package Ayuso;

import java.util.Scanner;
/**
 * isPrime.java
 * Asks the user for a number, checks if its a prime number or not, and prints whether it is or it isn't to the system console.
 * April 5/2017
 * @author Ian Ayuso
 */


public class IsPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = scan.nextInt();
		boolean isItPrime = isPrime(num);
		System.out.println(isItPrime);

	}
	/**
	 * Sends a number to this method to check if its a prime number or not.
	 * @param num - This is the number that is being checked.
	 * @return Returns true or false, true if prime, false if not.
	 */

	public static boolean isPrime (int num1){

		if (num1 == 1){
			return true;
		}
		if (num1 == 0){
			return false;
		}
		if (num1 == 2){
			return true;
		}
		for ( int i = 2; i < num1 / 2; i++){
			if (isDivisible(num1, i)){
				return false;
			}
		}
		return true;
	}
	/**
	 * Checks if num1 goes into num2 evenly.
	 * @param num1 The numerator, the number being divided.
	 * @param num2 The denominator, the number being divided by.
	 * @return Returns true or false, true if num1 is divisible by num2
	 */

	public static boolean isDivisible (int num1, int num2){

		int z = num1 % num2;
		if (z == 0){
			return true;
		}
		return false;
	}
}
