public class Main {
    public static void main(String[] args) {

        int loanAmount = 1_000_000; // сумма кредита
        double annualRate = 9.99; // годовая процентная ставка
        int years1 = 1;
        int years2 = 2;
        int years3 = 3;

        System.out.println("Ежемесячный аннуитетный платеж на срок в 1 год: " +
                (int) CreditPaymentService.calculate(loanAmount, annualRate, years1*12));
        System.out.println("Ежемесячный аннуитетный платеж на срок в 2 года: " +
                (int) CreditPaymentService.calculate(loanAmount, annualRate, years2*12));
        System.out.println("Ежемесячный аннуитетный платеж на срок в 3 года: " +
                (int) CreditPaymentService.calculate(loanAmount, annualRate, years3*12));
    }
}
