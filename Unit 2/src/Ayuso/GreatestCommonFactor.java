package Ayuso;

import java.util.Scanner;
/**
 * GreatestCommonFactor.java
 * Asks the user for 2 numbers, then finds the greatest common factor, and returns to the system console.
 * April 5/2017
 * @author Ian Ayuso
 */	

public class GreatestCommonFactor {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1 = scan.nextInt();
		System.out.println("Please enter a number");
		int num2 = scan.nextInt();
		int gCF = greatestCommonFactor(num1, num2);
		System.out.println(gCF);
		
	}
	
	/**
	 * Sends 2 numbers to this method, and finds the greatest common factor
	 * @param num1 The numerator, the number being divided.
	 * @param num2 The denominator, the number being divided by.
	 * @return Returns true or false, true if num1 is divisible by num2
	 */
	public static int greatestCommonFactor (int num1, int num2){
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		for(int i = min; i>0; i--){
			if(isDivisible(max,i) && isDivisible(min,i)){
				return i;
			}
		}
		return 1;
		
		
		
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
