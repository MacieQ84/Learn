/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author Maciek
 *
 */
public class Skaner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Podaj co�: ");
		String wartosc = inputData();
		System.out.println("Wpisa�e�: " + wartosc);
	}


	public static String inputData () {		
		Scanner skaner = new Scanner(System.in);
		return skaner.nextLine();
	}

}

