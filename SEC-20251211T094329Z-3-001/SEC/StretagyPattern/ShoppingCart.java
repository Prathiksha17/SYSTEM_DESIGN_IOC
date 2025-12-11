class ShoppingCart{
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrateggy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amt){
        paymentStrategy.pay(amt);
    }
}