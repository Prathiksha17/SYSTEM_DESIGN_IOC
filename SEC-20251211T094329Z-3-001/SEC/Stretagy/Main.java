class Main{
    public static void main(String [] args){
        CreditCardPayment ccpayment = new CreditCardPayment("41114606528353");
        DebitCardPayment debitPay = new DebitCardPayment("23453234567");
        CheckoutService checkoutService = new CheckoutService(ccpayment);
        CheckoutService checkoutService1 = new CheckoutService(debitPay);
        checkoutService1.checkout(100000);
        checkoutService.checkout(250000);
    }
}