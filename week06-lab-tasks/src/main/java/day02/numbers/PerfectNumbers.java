package day02.numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
}