class Chocolate {
    private int barCode;
    private String name;
    private int weight;
    private double cost;

    // Constructor to initialize the variables
    public Chocolate() {
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10.0;
    }

    // Setter method for barCode
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for weight
    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Setter method for cost
    public void setCost(double cost) {
        this.cost = cost;
    }

    // Getter method for barCode
    public int getBarCode() {
        return barCode;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for weight
    public int getWeight() {
        return weight;
    }

    // Getter method for cost
    public double getCost() {
        return cost;
    }
}

public class chocolateTester {
    public static void main(String[] args) {
        // Create an object of Chocolate
        Chocolate myChocolate = new Chocolate();

        // Use getter methods to display the initial values
        System.out.println("Initial Chocolate Details:");
        System.out.println("Bar Code: " + myChocolate.getBarCode());
        System.out.println("Name: " + myChocolate.getName());
        System.out.println("Weight: " + myChocolate.getWeight());
        System.out.println("Cost: $" + myChocolate.getCost());

        // Use setter methods to modify the values
        myChocolate.setBarCode(102);
        myChocolate.setName("Hershey's");
        myChocolate.setWeight(24);
        myChocolate.setCost(50.0);

        // Use getter methods to display the modified values
        System.out.println("\nModified Chocolate Details:");
        System.out.println("Bar Code: " + myChocolate.getBarCode());
        System.out.println("Name: " + myChocolate.getName());
        System.out.println("Weight: " + myChocolate.getWeight());
        System.out.println("Cost: $" + myChocolate.getCost());
    }
}
