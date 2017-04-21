package Ayuso;
/**
 * Perfect Integers
 * Prints all the perfect integers from 0 to 100 to the console.
 * 4/20/17
 * @author Ian Ayuso
 */
public class PerfectIntegers {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++){
			if (isPerfect(i) == true){
				System.out.println(i);
			}
		}
	}
/**
 * This method checks if the number sent is a perfect integer.
 * @param num The number to be checked if its a Perfect Integer.
 * @return Returns true or false, true if its a perfect number, false if not.
 */
	public static boolean isPerfect(int num){
		int sum = 0;
		for (int i = 1; i < num; i++){
			if (num % i == 0){
				sum = sum + i;
			}
		}
		if (num == sum){
			return true;
		}
		return false;
	}

}
