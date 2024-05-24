package org.example;

public class Main {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String operation = args[1];

        switch (operation) {
            case "+":
                System.out.println(MathOperation.addition(a, b));
                break;
            case "-":
                System.out.println(MathOperation.subtraction(a, b));
                break;
            case "*":
                System.out.println(MathOperation.multiplication(a, b));
                break;
            case "/":
                System.out.println(MathOperation.division(a, b));
                break;
            default:
                System.out.println("Invalid operation: " + operation);
        }
    }
}