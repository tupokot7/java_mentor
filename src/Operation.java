public class Operation {

    public static String calculate(NumberS first, NumberS second, String action) throws Exception {

        int result = switch (action) {
            case "+" -> first.getValue() + second.getValue();
            case "-" -> first.getValue() - second.getValue();
            case "*" -> first.getValue() * second.getValue();
            case "/" -> first.getValue() / second.getValue();
            default -> throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        };

        if (first.getType() == NumberT.ROMAN) {
            return Convertion.toRomanNumber(result);
        } else return String.valueOf(result);
    }
}
