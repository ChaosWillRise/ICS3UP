package Ayuso;

import java.util.Scanner;
/**
 * LargestNumber.java
 * Asks the user for amount of numbers, then finds the greatest number of the set.
 * April 5/2017
 * @author Ian Ayuso
 */	

public class LargestNumber {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter how many numbers you would like to enter");
		int[] arrayOfNumbers = new int[scan.nextInt()];
		
		for(int i = 0; i<= arrayOfNumbers.length;i++ ){
			System.out.println("Enter the number");
			arrayOfNumbers[i] = scan.nextInt();
		}
		int largestNumber = largestNumber(arrayOfNumbers);
		System.out.println(largestNumber);
	}
	/**
	 * Looks through the given array and finds the largest number.
	 * @param nums An array of numbers
	 * @return The largest number in the array
	 */
	public static int largestNumber (int[] nums){
		int max = 0;
		for(int i = 0; i <nums.length; i++){
			max = Math.max(max,  nums[i]);
		}
		return max;
	}

}
