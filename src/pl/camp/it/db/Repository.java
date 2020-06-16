package pl.camp.it.db;

import pl.camp.it.model.PieceProduct;
import pl.camp.it.model.Product;
import pl.camp.it.model.WeightProduct;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<Product> productList = new ArrayList<>();

    public Repository() {
        this.productList.add(
                new PieceProduct("Woda", 1.70, 10));
        this.productList.add(
                new WeightProduct("Ser", 0.02, 2000));
        this.productList.add(
                new PieceProduct("Piwo", 5.00, 8));
        this.productList.add(
                new WeightProduct("Kiełbasa", 0.03, 4500));
    }

    public List<Product> getProductList() {
        return productList;
    }
}
