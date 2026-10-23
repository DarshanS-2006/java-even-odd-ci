
package com.example;

public class EvenOdd {

    public static String checkEvenOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int number = args.length > 0
                ? Integer.parseInt(args[0])
                : 7;

        System.out.println(number + " is " + checkEvenOdd(number));
    }
}
