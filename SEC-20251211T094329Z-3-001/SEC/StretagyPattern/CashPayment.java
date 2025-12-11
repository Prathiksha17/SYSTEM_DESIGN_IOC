class CashPayment implements PaymentStrategy{
    public void pay(int amt){
        System.out.println("Please accept the cssh amount of : " + amt);
    }
}