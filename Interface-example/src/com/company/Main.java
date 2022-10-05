package com.company;

public class Main {

    public static void main(String[] args) {
        // dei vaala kara
        ICalculator calculator = new CalculatorService();
        int sum = calculator.add(1, 2);
        int sub = calculator.sub(1, 2);
        int mul = calculator.multiple(1, 2);
        int div = calculator.division(1, 2);

        //or
        //dei mani
        ICalculator calculator1 = new CalculatorService();
        sum = calculator1.add(1, 2);
        sub = calculator1.sub(1, 2);
        mul = calculator1.multiple(1, 2);
        div = calculator1.division(1, 2);

    }
}
