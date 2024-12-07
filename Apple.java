//Zy'Nasia Hunter
public class Apple {

	// Instance variables
    private String type;
    private double weight;
    private double price;

    // Default Constructor
    public Apple() {
        this.type = "Gala";  // Default type
        this.weight = 0.5;   // Default weight in kg
        this.price = 0.88;   // Default price in USD
    }

    // Parameterized Constructor
    public Apple(String xType, double xWeight, double xPrice) {
        setType(xType);
        setWeight(xWeight);
        setPrice(xPrice);
    }

    // Accessors (Getters)
    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    // Mutators (Setters)
    public void setType(String xType) {
        // Ensure type is valid
        if (xType.equals("Red Delicious") || xType.equals("Golden Delicious") || 
            xType.equals("Gala") || xType.equals("Granny Smith")) {
            this.type = xType;
        } else {
            this.type = null;  // Invalid type
            System.out.println("Invalid value for type!");
        }
    }

    public void setWeight(double xWeight) {
        // Ensure weight is between 0 and 2 kg
        if (xWeight >= 0 && xWeight <= 2) {
            this.weight = xWeight;
        } else {
            this.weight = 0.0;  // Invalid weight
            System.out.println("Invalid value for weight!");
        }
    }

    public void setPrice(double xPrice) {
        // Ensure price is non-negative
        if (xPrice >= 0) {
            this.price = xPrice;
        } else {
            this.price = 0.0;  // Invalid price
            System.out.println("Invalid value for price!");
        }
    }

    // Method to display apple details
    public void writeOutput() {
        System.out.println("Type: " + (type != null ? type : "null"));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: $" + price);
    }

}
