public class CreditPaymentService {

    public long calculate (long amountCredit, int mounts, double percent) {

       double monthlyRate = percent / (100 * 12);
       long monthlyPayment = (long) (amountCredit * (monthlyRate + (monthlyRate / (Math.pow((1 + monthlyRate), mounts) - 1))));


       return monthlyPayment;
    }
}
