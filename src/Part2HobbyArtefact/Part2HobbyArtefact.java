package Part2HobbyArtefact;

import java.util.Calendar;
class Drum {
    int year = Calendar.getInstance().get(Calendar.YEAR);
    private String manufacturer;
    private String model;
    private String producingCountry;
    private String type;
    private String material;
    private String color;
    private double price;
    private double radius;
    private int yearOfPurchase;

    // Constructor with initial values
    public Drum(String manufacturer, String model, String producingCountry,
                String type, String material, String color, double price, double radius, int yearOfPurchase) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.producingCountry = producingCountry;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.radius = radius;
        this.yearOfPurchase = yearOfPurchase;
    }

    // Getter and setter methods
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getProducingCountry() {
        return producingCountry;
    }
    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public int getYearOfPurchase() {
        return yearOfPurchase;
    }
    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getAge(int yearOfPurchase) {
        return year - yearOfPurchase;
    }

    // Method to output the full description of the book
    public void printDescription() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Producing country: " + producingCountry);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Radius: " + radius + "\"");
        System.out.println("Year of purchase: " + yearOfPurchase);
        System.out.println("Age: " + getAge(yearOfPurchase));
    }
}

public class Part2HobbyArtefact {
    public static void main(String[] args) {
        // Create objects of the Drum class
        Drum snare = new Drum("Pearl", "Roadshow", "Japan", "Snare Drum",
                        "Linden Wood", "Black", 90, 14, 2018);
        Drum bassDrum = new Drum("Pearl", "Roadshow", "Japan", "Bass Drum",
                "Linden Wood", "Black", 300, 20, 2018);

        // Output descriptions of the drums
        snare.printDescription();
        System.out.println();
        bassDrum.printDescription();
    }
}
