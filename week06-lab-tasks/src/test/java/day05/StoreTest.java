package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store;

    @BeforeEach
    void setUp() {
        Product productA = new Product("Bread", Type.BAKERY, 2.2);
        Product productB = new Product("Coffee", Type.BAKERY, 1.1);
        Product productC = new Product("Apple", Type.FRUIT, 1.2);
        store = new Store();
        store.addProduct(productA);
        store.addProduct(productB);
        store.addProduct(productC);
    }

    @Test
    void constructTest() {
        Store anotherStore = new Store();
        assertEquals(0, anotherStore.getProducts().size());
    }

    @Test
    void addProductTest() {
        assertEquals(3, store.getProducts().size());
    }

    @Test
    void numberOfProductsByTypeWithoutProductsTest() {
        store.getProducts().clear();
        assertEquals(0, store.numberOfProductsByType().size());
    }

    @Test
    void numberOfProductsByTypeTest() {
        List<ProductWithPiece> pwpList = store.numberOfProductsByType();
        int bakeryIndex = -1;
        int fruitIndex = -1;

        for (ProductWithPiece pwp : pwpList) {
            if (pwp.getType() == Type.BAKERY) {
                bakeryIndex = pwpList.indexOf(pwp);
            }
            if (pwp.getType() == Type.FRUIT) {
                fruitIndex = pwpList.indexOf(pwp);
            }
        }
        assertEquals(2, pwpList.size());
        assertEquals(2, pwpList.get(bakeryIndex).getCount());
        assertEquals(1, pwpList.get(fruitIndex).getCount());
    }
}