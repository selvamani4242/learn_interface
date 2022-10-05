package com.company;

public class CalculatorService implements ICalculator {
    @Override
    public int add(int i, int j) {
        int out = i + j;
        return out;
    }

    @Override
    public int sub(int i, int j) {
        int out = i - j;
        return out;
    }

    @Override
    public int multiple(int i, int j) {
        int out = i * j;
        return out;
    }

    @Override
    public int division(int q, int k) {
        int out = q / k;
        return out;
    }
}
