package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value1;
        int value2;
        String operation;

        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        value1 = scanner.nextInt();
        operation = scanner.next();
        value2 = scanner.nextInt();
        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        }
        if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }
        if (operation.equals("*")) {
            System.out.println("Output: " + "\n" + value1 * value2);
        }
        if (operation.equals("/")) {
            System.out.println("Output: " + "\n" + value1 / value2);
        }
    }
}