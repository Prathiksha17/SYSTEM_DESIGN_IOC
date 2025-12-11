class CheckoutService{
    private PaymentStretagy paymentStretagy;
    public CheckoutService(PaymentStretagy paymentStretagy){
        this.paymentStretagy = paymentStretagy;
    }
    public void checkout(int amt){
        paymentStretagy.pay(amt);
    }
}