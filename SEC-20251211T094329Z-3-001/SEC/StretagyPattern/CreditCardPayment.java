class CreditCardPayment implements PaymentStrategy{
    private String CardNumber ;

    public CreditCardPayment( String CardNumber){
        this.CardNumber = CardNumber;
    }

    public void pay( int amt){
        System.out.println("Paying using Credit card and Amt is: " +amt);
    }

}