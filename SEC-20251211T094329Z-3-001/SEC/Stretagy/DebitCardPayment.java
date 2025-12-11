class DebitCardPayment implements PaymentStretagy{
    private String debit_card_number;
    public DebitCardPayment(String debit_card_number){
        this.debit_card_number = debit_card_number;
    }
    public void pay(int amt){
        System.out.println("paid " + amt+ " using Debit Card " + debit_card_number );
    }
}