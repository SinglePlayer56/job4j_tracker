package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static class Multiple {
        private final int result;

        public Multiple(int number) {
            this.result = number;
        }

        public int getResult() {
            return this.result;
        }
    }

    public static Multiple getMultiple(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public double divide(int a) {
        return (double) a / x;
    }

    public double sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println("sum: " + result);
        Calculator calculator = new Calculator();
        int result2 = calculator.multiply(5);
        System.out.println("multiply: " + result2);
        int result3 = Calculator.minus(10);
        System.out.println("minus: " + result3);
        double result4 = calculator.divide(12);
        System.out.println("divide: " + result4);
        double result5 = calculator.sumAllOperation(7);
        System.out.println("sumAllOperation: " + result5);
        Calculator.Multiple multiple = Calculator.getMultiple(3);
        System.out.println("Квадрат числа равен " + multiple.getResult());
    }
}
