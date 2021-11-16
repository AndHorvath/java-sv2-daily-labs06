package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarShopTest {

    Car car1;
    Car car2;
    Car car3;
    Car car4;

    CarShop carShop;

    @BeforeEach
    void initCarShop() {
        car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
        car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
        car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
        car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);

        carShop = new CarShop("Best Car", 10_000_000);

        carShop.addCar(car1);
        carShop.addCar(car2);
        carShop.addCar(car3);
        carShop.addCar(car4);
    }

    @Test
    void getCarsForSellTest() {
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void decreasePriceTest() {
        car1.decreasePrice(10);
        assertEquals(2070000, carShop.getCarsForSell().get(0).getPrice());
    }

    @Test
    void sumCarPriceTest() {
        car1.decreasePrice(10);
        assertEquals(6270000, carShop.sumCarPrice());
    }

    @Test
    void numberOfCarsCheaperThanTestA() {
        car1.decreasePrice(10);
        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
    }

    @Test
    void numberOfCarsCheaperThanTestB() {
        car1.decreasePrice(10);
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void carsWithBrandTestA() {
        assertEquals(2, carShop.carsWithBrand("Toyota").size());
    }

    @Test
    void carsWithBrandTestB() {
        assertEquals(0, carShop.carsWithBrand("BMW").size());
    }
}