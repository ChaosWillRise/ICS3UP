package Ayuso;

import java.util.Scanner;
/**
 * SumOfDigits.java
 * Asks the user for a number, and prints the sum of all the numbers in the given number to the system console/
 * April 5/2017
 * @author Ian Ayuso
 */	

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int digits = scan.nextInt();
		int sum = sumOfDigits(digits);
		System.out.println(sum);

	}
	/**
	 * Takes all the digits of the given number and return the sum.
	 * @param num1 The number 
	 * @return Returns the sum of all the digits in the given number.
	 */
	public static int sumOfDigits (int num1){
		int sum = 0;
		while (num1>=1){
			sum = sum + num1 % 10;
			num1 = num1 / 10;
		}
		return sum;
	}
}
