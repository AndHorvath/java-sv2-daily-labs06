package day02.cars;

public class Car {

    // --- attributes ---------------------------------------------------------

    private final String carBrand;
    private final double engineDisplacement;
    private final Color color;
    private int price;

    // --- constructors -------------------------------------------------------

    public Car(String carBrand, double engineDisplacement, Color color, int price) {
        this.carBrand = carBrand;
        this.engineDisplacement = engineDisplacement;
        this.color = color;
        this.price = price;
    }

    // --- getters and setters ------------------------------------------------

    public String getCarBrand() { return carBrand; }

    public double getEngineDisplacement() { return engineDisplacement; }

    public Color getColor() { return color; }

    public int getPrice() { return price; }

    // --- public methods -----------------------------------------------------

    public void decreasePrice(int percent) {
        price = (int) (price * (1D - percent / 100D));
    }
}