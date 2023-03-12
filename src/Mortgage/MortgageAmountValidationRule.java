package Mortgage;

// Дополните класс для проверки суммы ипотеки пользователя
public class MortgageAmountValidationRule extends ValidationRule<Integer> {
    private static final int MIN_MORTGAGE_AMMOUNT = 1_000_000;
    private static final int MAX_MORTGAGE_AMMOUNT = 10_000_000;

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    // Объявите и реализуйте метод для проверки суммы ипотеки ниже
    @Override
    public boolean isValid() {
        boolean result = false;
        if (MIN_MORTGAGE_AMMOUNT < this.value && this.value < MAX_MORTGAGE_AMMOUNT)
            result = true;
        return result;

    }
}
