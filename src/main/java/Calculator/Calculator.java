package Calculator;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0){
            throw new DivideByZeroDenominator();
        }
        return (double) a / b;
    }
}
