package com.company;

//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        System.out.println("Input:");
//        Scanner scanner = new Scanner(System.in);
//
//        int number1 = scanner.nextInt();
//        String operation = scanner.next();
//        int number2 = scanner.nextInt();
//
//        if (number1 <=10 && number2 <= 10) {
//            if (operation.equals("+")) {
//                System.out.println("Output:" + "\n" + (number1 + number2));
//            }
//            if (operation.equals("-")) {
//                System.out.println("Output:" + "\n" + (number1 - number2));
//            }
//            if (operation.equals("*")) {
//                System.out.println("Output:" + "\n" + (number1 * number2));
//            }
//            if (operation.equals("/")) {
//                System.out.println("Output:" + "\n" + (number1 / number2));
//            }
//        }  else {
//            System.out.println("Вы не выполнили все требования, увы :(");
//        }
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    private static final char exitCharacter = '!';
//
//    public static void main(String[] args) {
//        DataReader reader = new DataReader(exitCharacter);
//        while (true) {
//            try {
//                reader.read();
//            } catch (RuntimeException e) {
//                System.err.println(e.getMessage());
//                continue;
//            }
//            if (reader.isExitFlag()) {
//                System.out.println("В выражении пристутствует знак выхода: " + exitCharacter);
//                System.out.println("Завершение программы.");
//                break;
//            }
//            double result = Calculator.calculate(reader.getVar1(), reader.getVar2(), reader.getOper());
//            System.out.println(result);
//        }
//    }
//}
//
//class DataReader {
//
//    private int number1;
//    private int number2;
//    private char operation;
//    private boolean exitFlag;
//    private final char exitCharacter;
//    private final char resultChar;
//
//    public DataReader(char exitCharacter) {
//        this.exitCharacter = exitCharacter;
//        this.resultChar = '=';
//    }
//
//
//    public void read() {
//
//        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
//
//        System.out.println("Введите выражение, состоящее из двух целых чисел от 0 до 10, знака операции и знака равно (напр. 2+2=): ");
//        Scanner scanner = new Scanner(System.in);
//        //StringBuilder builder = new StringBuilder();
//        String text = scanner.nextLine();
//        if (text.indexOf(exitCharacter) != -1) {
//            exitFlag = true;
//            return;
//        }
//
//        try {
//            if ((text.charAt(text.length() - 1) != resultChar)) {
//                throw new RuntimeException();
//            }
//
//            text = text.substring(0, text.length() - 1);
//            String[] blocks = text.split("[+-/*]");
//
//            // проверяем, входит ли строка blocks[0] в массив строк массива "roman"
//
//            boolean flag = false;
//            number1 = Integer.parseInt(blocks[0]);
//            number2 = Integer.parseInt(blocks[1]);
//            operation = text.charAt(blocks[0].length());
//
//
////            boolean flag = false;
////            for (String s : roman) {
////                if (s.equals(blocks[0]) || s.equals(blocks[1])) {
////                    flag = true;
////                }
////                //flag = true, значит будем иметь дело с римскими обозначениями
////                if (flag) {
////                    number1 = romanToNumber(blocks[0]);
////                    number2 = romanToNumber(blocks[1]);
////                } else {
////                    number1 = Integer.parseInt(blocks[0]);
////                    operation = text.charAt(blocks[0].length());
////                    number2 = Integer.parseInt(blocks[1]);
////
////                }
////            }
//            if ((number1 > 10 || number1 < 0) || (number2 > 10 || number2 < 0)) {
//                throw new IllegalArgumentException();
//            }
//        } catch (RuntimeException e) {
//            throw new IllegalArgumentException("Неверный формат данных");
//        }
//    }
//
//    private static int romanToNumber(String roman) {
//        return switch (roman) {
//            case "I" -> 1;
//            case "II" -> 2;
//            case "III" -> 3;
//            case "IV" -> 4;
//            case "V" -> 5;
//            case "VI" -> 6;
//            case "VII" -> 7;
//            case "VIII" -> 8;
//            case "IX" -> 9;
//            case "X" -> 10;
//            default -> -1;
//        };
//    }
//
//    public int getVar1() {
//        return number1;
//    }
//
//    public int getVar2() {
//        return number2;
//    }
//
//    public char getOper() {
//        return operation;
//    }
//
//    public boolean isExitFlag() {
//        return exitFlag;
//    }
//}
//
//class Calculator {
//    private Calculator(){}
//
//    public static double calculate(int number1, int number2, char operation){
//        return switch (operation) {
//            case '+' -> number1 + number2;
//            case '-' -> number1 - number2;
//            case '*' -> number1 * number2;
//            case '/' -> number1 / number2;
//            default -> throw new IllegalArgumentException("Не верный знак операции");
//        };
//    }
//
//}


import java.util.Scanner;

class Main {
    static int value(char a) {
        if (a=='m') return 1000;
        else if (a=='d') return 500;
        else if (a=='c') return 100;
        else if (a=='l') return 50;
        else if (a=='x') return 10;
        else if (a=='v') return 5;
        else if (a=='i') return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Roman numerals: ");
        String roman=in.nextLine();
        roman=roman.toLowerCase();
        int val;
        int val_next;
        int temp;
        int result=0;

        for (int i=0;i<roman.length();i++) {
            val=value(roman.charAt(i));
            if (i<roman.length()-1) {
                val_next=value(roman.charAt(i+1));
            } else val_next=0;

            if (val_next==0) {
                temp=val;
            } else {
                if (val>val_next) temp=val;
                else if (val<val_next) {
                    temp=val_next-val;
                    i++;
                } else temp=val;
            }
            result+=temp;
        }
        System.out.println("Result is: " + result);
    }
}