package TransactionValidator;

public class TransactionValidator {
    private static final double MIN_AMOUNT = 1;
    private static final double MAX_AMOUNT = 5000;
    // объявите константы

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean isValidAmount(double sum) {
        boolean result = false;
        if (sum < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
        } else if (MAX_AMOUNT < sum) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT +" р. Попробуйте ещё раз!");
        } else {
            result = true;
        }
        return result;
    }
}
