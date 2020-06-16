package pl.camp.it.model;

public class WeightProduct extends Product {
    // in grams
    private int weight;

    public WeightProduct() {
    }

    @Override
    public int getTotalAmount() {
        return this.weight;
    }

    @Override
    public void setTotalAmount(int newAmount) {
        this.weight = newAmount;
    }

    public WeightProduct(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
         return new StringBuilder()
                .append("WeightProduct:{")
                .append(super.toString())
                .append(", weight=")
                .append(this.weight)
                .append("}")
                .toString();
    }
}
