// Zy'Nasia Hunter
public class Vehicle {

	private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 0;
        this.ownerName = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        setManufacturerName(manufacturerName);
        setNumberOfCylinders(numberOfCylinders);
        setOwnerName(ownerName);
    }

    // Accessor and Mutators (Getters and Setters)
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            System.out.println("Number of cylinders must be greater than 0.");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // equals method
    public boolean equals(Vehicle otherVehicle) {
        return this.manufacturerName.equals(otherVehicle.manufacturerName) &&
                this.numberOfCylinders == otherVehicle.numberOfCylinders &&
                this.ownerName.equals(otherVehicle.ownerName);
    }

    // toString method
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName + "\n" +
                "Number Of Cylinders: " + numberOfCylinders + "\n" +
                "Owner's Name: " + ownerName;
    }

}
