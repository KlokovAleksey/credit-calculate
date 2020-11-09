public class Main {
    public static void main(String[] args) {
        CreditPaymentService sevice = new CreditPaymentService();
        long yearPayment = sevice.calculate(1000000, 12);
        System.out.println(yearPayment);
        long twoYearPayment = sevice.calculate(1000000, 24);
        System.out.println(twoYearPayment);
        long threeYearPayment = sevice.calculate(1000000, 36);
        System.out.println(threeYearPayment);
    }
}