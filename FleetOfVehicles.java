// Zy'Nasia Hunter
import java.util.ArrayList;
import java.util.Scanner;
public class FleetOfVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> fleet = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to the fleet manager");

        while (running) {
            System.out.println("Enter 1: to add a Vehicle");
            System.out.println("Enter 2: to remove a Vehicle");
            System.out.println("Enter 9 to quit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("Enter 1: if it is a car");
                System.out.println("Enter 2: if it is a truck");
                System.out.println("Enter 3: if it is unclassified");
                int vehicleType = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (vehicleType == 1) { // Add Car
                    System.out.println("Enter the manufacturer's name");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter the number of cylinders");
                    int cylinders = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter the owner's name");
                    String owner = scanner.nextLine();
                    System.out.println("Enter the car's gas mileage");
                    double gasMileage = scanner.nextDouble();
                    System.out.println("Enter the number of passengers");
                    int passengers = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Car car = new Car(manufacturer, cylinders, owner, gasMileage, passengers);
                    fleet.add(car);
                } else if (vehicleType == 2) { // Add Truck
                    System.out.println("Enter the manufacturer's name");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter the number of cylinders");
                    int cylinders = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter the owner's name");
                    String owner = scanner.nextLine();
                    System.out.println("Enter the truck's load capacity");
                    double loadCapacity = scanner.nextDouble();
                    System.out.println("Enter the truck's towing capacity");
                    double towingCapacity = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    Truck truck = new Truck(manufacturer, cylinders, owner, loadCapacity, towingCapacity);
                    fleet.add(truck);
                } else { // Unclassified vehicle
                    System.out.println("Enter the manufacturer's name");
                    String manufacturer = scanner.nextLine();
                    System.out.println("Enter the number of cylinders");
                    int cylinders = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter the owner's name");
                    String owner = scanner.nextLine();

                    Vehicle vehicle = new Vehicle(manufacturer, cylinders, owner);
                    fleet.add(vehicle);
                }

                // Display the fleet
                System.out.println("The Fleet currently");
                for (Vehicle v : fleet) {
                    System.out.println(v);
                    System.out.println();
                }
            } else if (choice == 2) { // Remove Vehicle
                System.out.println("Enter the manufacturer's name of the vehicle to remove");
                String manufacturer = scanner.nextLine();
                fleet.removeIf(vehicle -> vehicle.getManufacturerName().equalsIgnoreCase(manufacturer));

                // Display the fleet after removal
                System.out.println("The Fleet currently");
                for (Vehicle v : fleet) {
                    System.out.println(v);
                    System.out.println();
                }
            } else if (choice == 9) { // Quit
                running = false;
            }
        }

        System.out.println("Goodbye!");
	}

}
