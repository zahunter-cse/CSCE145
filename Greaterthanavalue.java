//Zy'nasia Hunter
import java.util.Scanner;

public class Greaterthanavalue {
public static final int VALUE = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//package - a library of classes that have been pre-defined
		// eg: Scanner
		
		Scanner key = new Scanner(System.in); // creating a scanner object
		
		System.out.println("Enter an integer:"); // ask the user for an input value
		
		int number = key.nextInt();
		
		if(number > VALUE)
		{
			//if block
			System.out.println("The number entered is greater than 1000!");
		}
		else
		{
			//else block
			System.out.println("The number entered is not greater than 1000!");
		}
		
		
		
	}

}
