import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Input: ");
            String line = scanner.nextLine();

            if (line.equals("close")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Неверный ввод данных :(");

                NumberS firstNumber = Convertion.parseAndValidate(symbols[0]);
                NumberS secondNumber = Convertion.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Operation.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void startCalc() {
        System.out.println("Введите арабские (от 1 до 10) или римские (от I до X) цифры. " + "\n" + "Выполните: сложение(+), вычитание(-), умножение(*) или деление(/)");
        System.out.println("И нажмите: 'Enter'.");
        System.out.println("Если передумали, то введите 'close'.");
    }

    private static void exitCalc() {

        System.out.println("Пока-пока :)");

    }
}
