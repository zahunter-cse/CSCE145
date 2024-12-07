import java.util.Scanner;
public class Whatsforlunch {

	public static void main(String[] args) {
		// print a message on the console
		// single line comment
		
		/*
		 * Multi-line comment
		 */

		System.out.println("Welcome to my first Java Program!\n");
		// what does \n mean? and why do we use it?
		
		/*
		 *  \n - new line
		 *  Escape characters
		 */
		
		System.out.print("\"JAVA\" is fun\n");
		// why?
		System.out.print("JAVA is fun!");
		// why didn't we do print line?
		
		// create a new scanner object
		java.util.Scanner key = new Scanner(System.in);
		
		System.out.println("What\'s for lunch today? Enter entree:");
		
		String entree;   // declare a variable
		
		entree = key.nextLine();
		
		System.out.println("Entree: "+ entree);
		
		// + concatenation operator
		// = assignment operator
		
		
		
		/* 
		 * You need to go back and find the codes for 9/3/24 class, and make notes
		 */
		
		System.out.println("Enter side and drink:");

		String side = key.next();
		String drink = key.next();
		System.out.println("Side: "+ side);	
		
		
		
		
		
		
	}

}

 