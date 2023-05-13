
public class Calculator {
    public static void main(String[] args) {
        double number1 = (int) (Math.random() * 10);
        double number2 = (int) (Math.random() * 10);
        System.out.println(number1);
        System.out.println(number2);

        String[] randomSymbol = new String[]{"+", "-", "*", "/"};
        int n = (int) Math.floor(Math.random() * randomSymbol.length);
        String symbol = randomSymbol[n];
        System.out.println(symbol);
        double result;
        switch (symbol) {
            case "+":
                result = number1 + number2;
                System.out.println(result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(result);
                break;
            default:
                System.out.println("Неопределенная операция");
        }
    }
}
