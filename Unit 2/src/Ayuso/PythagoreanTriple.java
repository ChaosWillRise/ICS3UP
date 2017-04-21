package Ayuso;
/**
 * Pythagorean Triples
 * Prints all the pythagorean triples, with a and b being less than 100, to the console.
 * 4/20/17
 * @author 334968385
 */
public class PythagoreanTriple {

	public static void main(String[] args){
		for (int a = 1; a <= 100; a++){
			for(int b = 1; b <= 100; b++){
				double c = Math.pow(a, 2) + Math.pow(b, 2);
				if (isPerfectSquare(c) == true){
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + Math.sqrt(c));
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
			}
		}
	}

	/**
	 * This method checks if the number sent is a Perfect Square.
	 * @param num The number to be checked if its a Perfect Square.
	 * @return Returns true or false, true if num is a perfect square, false if not.
	 */
	public static boolean isPerfectSquare (double num){
		int srt = (int)Math.sqrt(num);
		if (num == Math.pow(srt, 2)){
			return true;
		}
		return false;
	}

}
