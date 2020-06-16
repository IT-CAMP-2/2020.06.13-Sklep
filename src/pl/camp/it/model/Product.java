package pl.camp.it.model;

public abstract class Product {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract int getTotalAmount();
    public abstract void setTotalAmount(int newAmount);

    @Override
    public String toString() {
        return "name=" + name + ", price=" + price;
    }
}
