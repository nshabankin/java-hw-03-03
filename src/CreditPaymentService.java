public class CreditPaymentService {
    /**
     * Расчет аннуитетного платежа по кредиту.
     * Формула: Sе = S * P/12 * (1+P/12)^N / ( (1+P/12)^N -1 )
     *
     * @param loanAmount Общая сумма кредита (S)
     * @param annualRate Годовая процентная ставка (P)
     * @param months     Количество месяцев (N)
     * @return Ежемесячный аннуитетный платеж
     */
    public static double calculate(double loanAmount, double annualRate, int months) {
        // Преобразовать годовую процентную ставку в десятичную дробь и найти месячную ставку
        double monthlyRate = annualRate / 100 / 12;

        // Рассчитать и вернуть аннуитетный платеж по формуле
        return loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }
}
