package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        double realNumber;

        do {
            System.out.println("Enter a positive real number!" );
            realNumber = scanner.nextDouble();
            positiveNumberContainer.addPositiveNumber(realNumber);
        } while (realNumber > 0.00001);

        positiveNumberContainer.getRealNumbers().remove(positiveNumberContainer.getRealNumbers().size() - 1);

        System.out.println(positiveNumberContainer.getRealNumbers());
    }
}