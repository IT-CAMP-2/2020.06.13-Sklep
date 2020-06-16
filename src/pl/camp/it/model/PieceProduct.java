package pl.camp.it.model;

public class PieceProduct extends Product {
    private int amount;

    public PieceProduct() {
    }

    @Override
    public int getTotalAmount() {
        return this.amount;
    }

    @Override
    public void setTotalAmount(int newAmount) {
        this.amount = newAmount;
    }

    public PieceProduct(String name, double price, int amount) {
        super(name, price);
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("PieceProduct:{")
                .append(super.toString())
                .append(", amount=")
                .append(this.amount)
                .append("}")
                .toString();
    }
}
