
import java.util.Scanner;
public class ClockTimeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		 // Infinite loop to repeat the process
        while (true) {
            try {
                // First object: Convert military time
                TimeConverter timeConverter1 = new TimeConverter();
                System.out.println("Enter the hours on the military clock:");
                int hours = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the minutes on the military clock:");
                int minutes = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the seconds on the military clock:");
                int seconds = Integer.parseInt(scanner.nextLine());
                timeConverter1.updateTime(hours, minutes, seconds);
                System.out.print("12-hour clock time → ");
                timeConverter1.displayTime();

                // Second object: Convert time from string format
                TimeConverter timeConverter2 = new TimeConverter();
                System.out.println("Enter 24 hour clock time in the format \"hours:minutes:seconds\":");
                String timeString = scanner.nextLine();
                timeConverter2.updateTime(timeString);
                System.out.print("12-hour clock time → ");
                timeConverter2.displayTime();

                // Ask user if they want to repeat
                System.out.println("Would you like to do this again? Enter \"Yes\" or \"No\":");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("No")) {
                    System.out.println("Exiting the program!");
                    break; // Exit the loop and end the program
                }

            } catch (TimeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("EXCEPTION: Invalid time entered!");
            }
        }

        scanner.close();
		
		
	}

}
