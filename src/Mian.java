public class Mian {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        long monthlyPayment12 = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж по кредиту: " + monthlyPayment12 + " руб.");

        long monthlyPayment24 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платеж по кредиту: " + monthlyPayment24 + " руб.");

        long monthlyPayment36 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платеж по кредиту: " + monthlyPayment36 + " руб.");
    }
}
