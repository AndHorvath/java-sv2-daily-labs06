package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> realNumbers;

    public List<Double> getRealNumbers() {
        return realNumbers;
    }

    public PositiveNumberContainer() {
        realNumbers = new ArrayList<>();
    }

    public void addPositiveNumber(double realNumber) {
        realNumbers.add(realNumber);
    }
}