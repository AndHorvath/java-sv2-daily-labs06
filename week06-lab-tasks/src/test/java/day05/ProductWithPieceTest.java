package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    Type type;
    ProductWithPiece pwp;

    @BeforeEach
    void setUp() {
        type = Type.BAKERY;
        pwp = new ProductWithPiece(type);
    }

    @Test
    void constructTest() {
        assertEquals(Type.BAKERY, pwp.getType());
        assertEquals(1, pwp.getCount());
    }

    @Test
    void incrementCountTest() {
        pwp.incrementCount();
        assertEquals(2, pwp.getCount());
    }
}