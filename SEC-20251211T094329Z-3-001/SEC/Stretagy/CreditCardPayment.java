class CreditCardPayment implements PaymentStretagy{
    private String credit_card_number;
    public CreditCardPayment(String credit_card_number){
        this.credit_card_number = credit_card_number;
    }
    public void pay(int amt){
        System.out.println("paid " + amt+ " using Credit Card " + credit_card_number );
    }
}