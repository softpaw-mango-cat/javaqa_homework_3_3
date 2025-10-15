public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment = service.calculate(1_000_000, 1, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + monthlyPayment + " рублей.");

        monthlyPayment = service.calculate(1_000_000, 2, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + monthlyPayment + " рублей.");

        monthlyPayment = service.calculate(1_000_000, 3, 9.99);
        System.out.println("Сумма ежемесячного платежа составит: " + monthlyPayment + " рублей.");
    }
}
