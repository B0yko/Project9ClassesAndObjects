package Part4Pizza;

class Pizza {
    private String name;
    private double price;

    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
            System.out.println("Pizza (" +
                    "name = '" + name + '\'' +
                    ", price = $" + price +
                    ')');
        return "-----";
    }
}
