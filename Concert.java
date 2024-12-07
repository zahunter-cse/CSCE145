// Zy'Nasia Hunter
public class Concert {

	private String name;
    private int capacity;
    private int ticketsSoldByPhone;
    private int ticketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default constructor
    public Concert() {
        this.name = "No name yet";
        this.capacity = 0;
        this.ticketsSoldByPhone = 0;
        this.ticketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Constructor with band name, capacity, and ticket prices
    public Concert(String name, int capacity, double priceByPhone, double priceAtVenue) {
        this.name = name;
        this.capacity = capacity;
        this.ticketsSoldByPhone = 0;
        this.ticketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Constructor with all parameters
    public Concert(String name, int capacity, int ticketsSoldByPhone, int ticketsSoldAtVenue,
                   double priceByPhone, double priceAtVenue) {
        this.name = name;
        this.capacity = capacity;
        this.ticketsSoldByPhone = ticketsSoldByPhone;
        this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors and Mutators

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Capacity must be greater than 0.");
        }
    }

    public int getTicketsSoldByPhone() {
        return ticketsSoldByPhone;
    }

    public void setTicketsSoldByPhone(int ticketsSoldByPhone) {
        if (ticketsSoldByPhone >= 0) {
            this.ticketsSoldByPhone = ticketsSoldByPhone;
        } else {
            System.out.println("Tickets sold by phone cannot be negative.");
        }
    }

    public int getTicketsSoldAtVenue() {
        return ticketsSoldAtVenue;
    }

    public void setTicketsSoldAtVenue(int ticketsSoldAtVenue) {
        if (ticketsSoldAtVenue >= 0) {
            this.ticketsSoldAtVenue = ticketsSoldAtVenue;
        } else {
            System.out.println("Tickets sold at venue cannot be negative.");
        }
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        } else {
            System.out.println("Ticket price by phone cannot be negative.");
        }
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        } else {
            System.out.println("Ticket price at venue cannot be negative.");
        }
    }

    // Methods

    // Method to calculate the total number of tickets sold
    public int totalNumberOfTicketsSold() {
        return ticketsSoldByPhone + ticketsSoldAtVenue;
    }

    // Method to calculate the number of tickets remaining
    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    // Method to buy tickets at the venue
    public void buyTicketsAtVenue(int numberOfTickets) {
        if (numberOfTickets >= 0 && ticketsRemaining() >= numberOfTickets) {
            ticketsSoldAtVenue += numberOfTickets;
        } else if (ticketsRemaining() == 0) {
            System.out.println("The concert is sold out!");
        } else {
            System.out.println("Invalid number of tickets. Not enough tickets remaining.");
        }
    }

    // Method to buy tickets by phone
    public void buyTicketsByPhone(int numberOfTickets) {
        if (numberOfTickets >= 0 && ticketsRemaining() >= numberOfTickets) {
            ticketsSoldByPhone += numberOfTickets;
        } else if (ticketsRemaining() == 0) {
            System.out.println("The concert is sold out!");
        } else {
            System.out.println("Invalid number of tickets. Not enough tickets remaining.");
        }
    }

    // Method to calculate total sales
    public double totalSales() {
        return (ticketsSoldByPhone * priceByPhone) + (ticketsSoldAtVenue * priceAtVenue);
    }

    // Method to display current concert details
    public void displayConcertDetails() {
        System.out.println("Currently the concert featuring the band " + name);
        System.out.println("Has sold " + ticketsSoldByPhone + " tickets by phone");
        System.out.println("Has sold " + ticketsSoldAtVenue + " tickets at the venue");
        System.out.println("And has grossed $" + totalSales());
    }

}
