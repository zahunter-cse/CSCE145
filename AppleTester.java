//Zy'Nasia Hunter
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating scanner object to take input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Apple tester!!!");

        // (a) Creating the first apple using the default constructor
        System.out.println("\nCreating the first apple!");
        Apple apple1 = new Apple();
        System.out.println("Default values of the first apple object:");
        apple1.writeOutput();

        // (b) Creating the second apple using the parameterized constructor
        System.out.println("\nEnter the type of the second apple object:");
        String type = scanner.nextLine();

        System.out.println("Enter the weight of the second apple object:");
        double weight = scanner.nextDouble();

        System.out.println("Enter the price of the second apple object:");
        double price = scanner.nextDouble();

        // Creating the second apple object with user input
        Apple apple2 = new Apple(type, weight, price);
        System.out.println("\nCreating the second apple object!");
        System.out.println("Values of the second apple object:");
        apple2.writeOutput();

        // Closing scanner to prevent resource leak
        scanner.close();
		
	}

}
