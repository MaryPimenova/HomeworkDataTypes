package ru.maruspim;

public class MathOperations {
    // Упражнения с математическими и логическими операторами, переполнением при вычислениях
    public static void main(String[] args)
    {
        int number1 = 666;
        int number2 = 28;
        int k = 5;
        short number3 = 19;
        long number4 = 100L;
        double number5 = 5.78;
        byte number6 = 100;
        byte number7 = 120;

        System.out.println("Welcome to Java. Here are some calculations:");
        System.out.println("The sum of numbers is " + (number1 + number2) + ".");
        System.out.println("The difference of numbers is " + (number1 - number2) + ".");
        System.out.println("The product of numbers is " + (number1 * number2) + ".");
        System.out.println("The quotient of numbers is " + (number1 / number2) + ".");
        System.out.println("The remainder of the division of numbers is " + (number1 % number2) + ".");

        System.out.println("Go on. What about logical operators?");
        if (number1 >= k * number2 && number1 < 1000) {
            System.out.println("Everything is OK, condition is fulfilled.");
        }
            else {
            System.out.println("Oh no, it is false.");
        }
        System.out.println("Let's try ternary operator...");
        boolean result1 = (number2 == number3) ? true : false;
        System.out.println("Flag of equality of numbers: " + result1 + ".");
        boolean result2 = (number5 <= number3) ? true : false;
        System.out.println("Flag of comparison of numbers: " + result2 + ".");

        System.out.println("Work with different primitive data types.");
        System.out.println("The sum of int and double numbers: " + (number2 + number5) + ".");
        System.out.println("The difference of int and double numbers: " + (number5 - number2) + ".");
        System.out.println("The product of short and double numbers: " + (number3 * number2) + ".");
        System.out.println("The quotient of long and double numbers: " + (number4 / number5) + ".");

        System.out.println("Overflow it!");
        System.out.println("Remember, that byte range id from -128 to 127.");
        byte sumByte = (byte) (number6 + number7);
        System.out.println("The sum with overflow: " + sumByte + ".");

    }
}