public class CreditPaymentService {
    public long calculate(long sum, int month) {
        double monthPercent = 9.99 / 12 / 100;
        double monthPayment = sum * (monthPercent + monthPercent / (Math.pow((1 + monthPercent), month) - 1));
        return (long) monthPayment;
    }
}
