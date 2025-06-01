class RetailItem {
    private String description;
    private int units;
    private double price;

    public RetailItem(String description, int units, double price) {
        this.description = description;
        this.units = units;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        if (units >= 0) {
            this.units = units;
        } else {
            System.out.println("Units cannot be negative.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Method to display item details
    public void displayItem() {
        System.out.println("Description: " + description);
        System.out.println("Units in Stock: " + units);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

public class P2 {
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println("Retail Items:");
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // update the values
        item1.setUnits(15);
        item1.setPrice(55.99);

        System.out.println("Updated details of item1:");
        item1.displayItem();
    }
} 