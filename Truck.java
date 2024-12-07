// Zy'Nasia Hunter
public class Truck extends Vehicle{

	private double loadCapacity;
    private double towingCapacity;

    // Default constructor
    public Truck() {
        super(); // Calls Vehicle's default constructor
        this.loadCapacity = 0.0;
        this.towingCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
        super(manufacturerName, numberOfCylinders, ownerName); // Calls Vehicle's parameterized constructor
        setLoadCapacity(loadCapacity);
        setTowingCapacity(towingCapacity);
    }

    // Accessor and Mutators for Truck class
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity >= 0) {
            this.loadCapacity = loadCapacity;
        } else {
            System.out.println("Load capacity must be non-negative.");
        }
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity >= 0) {
            this.towingCapacity = towingCapacity;
        } else {
            System.out.println("Towing capacity must be non-negative.");
        }
    }

    // Overriding equals method
    public boolean equals(Truck otherTruck) {
        return super.equals(otherTruck) && this.loadCapacity == otherTruck.loadCapacity && this.towingCapacity == otherTruck.towingCapacity;
    }

    // Overriding toString method
    public String toString() {
        return super.toString() + "\n" +
                "Load Capacity: " + loadCapacity + "\n" +
                "Towing Capacity: " + towingCapacity;
    }
	
	
}
