package Ayuso;

import java.util.Scanner;
/**
 * isPalindrome
 * Prints whether or not a word is a palindrome.
 * 4/14/17
 * @author 334968385
 */

public class isPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		if(isPalindrome(word) == true){
			System.out.println("This word is a palindrome.");
		}
		else{
			System.out.println("This is not a palindrome.");
		}

	}
	/**
	 * This method checks if a word is a palindrome.
	 * @param word The word that is checked if it is a palindrome.
	 * @return Returns true or false, true if it is a palindrome, false if not.
	 */
	public static boolean isPalindrome (String word){
		for (int i = 0; i < word.length()/2; i++){
			if (word.charAt(i) != word.charAt(word.length() - i - 1)){
				return false;
			}
		}
		return true;
	}

}
