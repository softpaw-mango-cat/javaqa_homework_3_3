public class CreditPaymentService {

    public int calculate(int creditRoubles, int periodYears, double ratePercent) {

        // считаем ежемесячную ставку %
        double monthlyRate = ratePercent / 12 / 100;

        // на сколько месяцев кредит
        int months = periodYears * 12;

        // формула ежемесячного платежа
        int result = (int) (creditRoubles * (monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1));

        return result;
    }
}
