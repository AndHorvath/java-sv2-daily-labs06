package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    // --- attributes ---------------------------------------------------------

    private String shopName;
    private int maximumCarPrice;
    private List<Car> carsForSell;

    // --- constructors -------------------------------------------------------

    public CarShop(String shopName, int maximumCarPrice) {
        this.shopName = shopName;
        this.maximumCarPrice = maximumCarPrice;

        carsForSell = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public String getShopName() { return shopName; }

    public int getMaximumCarPrice() { return maximumCarPrice; }

    public List<Car> getCarsForSell() { return carsForSell; }

    // --- public methods -----------------------------------------------------

    public boolean addCar(Car car) {
        if (car.getPrice() <= maximumCarPrice) {
            return carsForSell.add(car);
        }
        return false;
    }

    public int sumCarPrice() {
        int sumOfPrices = 0;

        for (Car car : carsForSell) {
            sumOfPrices += car.getPrice();
        }
        return sumOfPrices;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCarsCheaperThanGivenPrice = 0;

        for (Car car : carsForSell) {
            if (car.getPrice() <= price) {
                numberOfCarsCheaperThanGivenPrice++;
            }
        }
        return numberOfCarsCheaperThanGivenPrice;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithGivenBrand = new ArrayList<>();

        for (Car car : carsForSell) {
            if (car.getCarBrand().equals(brand)) {
                carsWithGivenBrand.add(car);
            }
        }
        return carsWithGivenBrand;
    }
}