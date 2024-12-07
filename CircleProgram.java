// Zy'Nasia Hunter
import java.util.Scanner;
public class CircleProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Circle[] circles = null;
        int circleCount = 0;
        boolean validChoice = true;

        // Main menu loop
        do {
            // Displaying the menu
            System.out.println("\n--- Circle Program Menu ---");
            System.out.println("1. Enter Circles' Data");
            System.out.println("2. Sort Circles by Area (Smallest to Largest)");
            System.out.println("3. Sort Circles by Area (Largest to Smallest)");
            System.out.println("4. Display Unique Circles' Areas");
            System.out.println("5. Quit");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Step 1: Collect circle data from the user
                    System.out.print("Enter the total number of circles: ");
                    circleCount = scanner.nextInt();

                    // Validate the number of circles
                    while (circleCount <= 0) {
                        System.out.println("Invalid number! Please enter a positive number.");
                        System.out.print("Enter the total number of circles: ");
                        circleCount = scanner.nextInt();
                    }

                    circles = new Circle[circleCount];  // Initialize the array of circles

                    // Get the radius for each circle
                    for (int i = 0; i < circleCount; i++) {
                        System.out.print("Enter the radius of circle " + (i + 1) + ": ");
                        double radius = scanner.nextDouble();
                        circles[i] = new Circle(radius);  // Create a new Circle object and store it
                    }
                    break;

                case 2:
                    // Step 2: Sort circles by area from smallest to largest
                    if (circles == null || circles.length == 0) {
                        System.out.println("Cannot sort. No circles in the collection.");
                    } else {
                        // Sorting by area in ascending order
                        sortCircles(circles, true);
                        System.out.println("\nCircles sorted by area (Smallest to Largest):");
                        displayCircles(circles);
                    }
                    break;

                case 3:
                    // Step 3: Sort circles by area from largest to smallest
                    if (circles == null || circles.length == 0) {
                        System.out.println("Cannot sort. No circles in the collection.");
                    } else {
                        // Sorting by area in descending order
                        sortCircles(circles, false);
                        System.out.println("\nCircles sorted by area (Largest to Smallest):");
                        displayCircles(circles);
                    }
                    break;

                case 4:
                    // Step 4: Display unique circle areas
                    if (circles == null || circles.length == 0) {
                        System.out.println("No circles in the collection.");
                    } else {
                        System.out.println("\nDisplaying unique circle areas:");
                        displayUniqueAreas(circles);
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Goodbye!");
                    validChoice = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
            }
        } while (validChoice);

        scanner.close();
    }

    // Method to sort the circles by area
    public static void sortCircles(Circle[] circles, boolean ascending) {
        for (int i = 0; i < circles.length - 1; i++) {
            for (int j = i + 1; j < circles.length; j++) {
                double area1 = circles[i].getArea();
                double area2 = circles[j].getArea();

                if (ascending && area1 > area2 || !ascending && area1 < area2) {
                    // Swap the circles
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

    // Method to display the circles
    public static void displayCircles(Circle[] circles) {
        for (Circle circle : circles) {
            System.out.println("Radius: " + circle.getRadius() + ", Area: " + circle.getArea());
        }
    }

    // Method to display only unique circle areas
    public static void displayUniqueAreas(Circle[] circles) {
        boolean[] displayed = new boolean[circles.length]; // To track displayed areas
        for (int i = 0; i < circles.length; i++) {
            if (!displayed[i]) {
                double area = circles[i].getArea();
                boolean isUnique = true;

                // Check for duplicates
                for (int j = i + 1; j < circles.length; j++) {
                    if (area == circles[j].getArea()) {
                        isUnique = false;
                        displayed[j] = true; // Mark duplicate as displayed
                    }
                }

                if (isUnique) {
                    System.out.println("Unique Area: " + area);
                }
            }
        }
    }
}

// Circle class to hold circle data
class Circle {
    private double radius;

    // Constructor to create a circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;  // Area = πr²
    }

    // Accessor for radius
    public double getRadius() {
        return radius;

	}

}
