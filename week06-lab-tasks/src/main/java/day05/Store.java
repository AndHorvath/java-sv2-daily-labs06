package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    // --- attributes ---------------------------------------------------------

    private List<Product> products = new ArrayList<>();

    // --- getters and setters ------------------------------------------------

    public List<Product> getProducts() { return products; }

    // --- public methods -----------------------------------------------------

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<ProductWithPiece> numberOfProductsByType() {
        List<ProductWithPiece> result = new ArrayList<>();

        for (Product actual : products) {
            ProductWithPiece pwp = containsProduct(actual, result);
            if (pwp != null) {
                pwp.incrementCount();
            } else {
                result.add(new ProductWithPiece(actual.getType()));
            }
        }
        return result;
    }

    // --- private methods -----------------------------------------------------

    private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> pwpList) {
        for (ProductWithPiece pwp : pwpList) {
            if (actual.getType() == pwp.getType()) {
                return pwp;
            }
        }
        return null;
    }
}