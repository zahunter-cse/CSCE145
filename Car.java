// Zy'Nasia Hunter
public class Car extends Vehicle{

	private double gasMileage;
    private int numberOfPassengers;

    // Default constructor
    public Car() {
        super(); // Calls Vehicle's default constructor
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName); // Calls Vehicle's parameterized constructor
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    // Accessor and Mutators for Car class
    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            System.out.println("Gas mileage must be non-negative.");
        }
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            System.out.println("Number of passengers must be non-negative.");
        }
    }

    // Overriding equals method
    public boolean equals(Car otherCar) {
        return super.equals(otherCar) && this.gasMileage == otherCar.gasMileage && this.numberOfPassengers == otherCar.numberOfPassengers;
    }

    // Overriding toString method
    public String toString() {
        return super.toString() + "\n" +
                "Gas Mileage: " + gasMileage + " gallons\n" +
                "Number of Passengers: " + numberOfPassengers;
    }
	
	
}
