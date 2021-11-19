package day05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    String name = "Bread";
    Type type = Type.BAKERY;
    double price = 2.2D;
    Product product = new Product(name, type, price);

    @Test
    void getNameTest() {
        String expectedName = "Bread";
        assertEquals(expectedName, product.getName());
    }

    @Test
    void getTypeTest() {
        Type expectedType = Type.BAKERY;
        assertEquals(expectedType, product.getType());
    }

    @Test
    void getPriceTest() {
        double expectedDouble = 2.2D;
        double eps = 0.000001D;
        assertEquals(expectedDouble, product.getPrice(), eps);
    }
}