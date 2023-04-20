package N2Ex3;

public class Main {

    public static void main(String[] args) {

        Operation operation = () -> operation("*", 10.5F,3.1F);
        System.out.println(operation.operation());
    }

    public static float operation (String operator, float num1, float num2) {

        float result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
        return result;
    }
}
