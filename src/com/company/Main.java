package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        String operation = scanner.next();
        int number2 = scanner.nextInt();

        if (number1 <=10 && number2 <= 10) {
            if (operation.equals("+")) {
                System.out.println("Output: " + "\n" + (number1 + number2));
            }
            if (operation.equals("-")) {
                System.out.println("Output: " + "\n" + (number1 - number2));
            }
            if (operation.equals("*")) {
                System.out.println("Output: " + "\n" + (number1 * number2));
            }
            if (operation.equals("/")) {
                System.out.println("Output: " + "\n" + (number1 / number2));
            }
        }
    }
}