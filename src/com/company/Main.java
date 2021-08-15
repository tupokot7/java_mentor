package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int number1 = k.nextInt();
        int number2 = k.nextInt();
        System.out.print(number1 + number2);
        System.out.println("Что будет сейчас?");
    }
}
