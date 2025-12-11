class DebitCard implements PaymentStrategy{

    private String debitCard;
    public DebitCard(String debitCard){
        this.debitCard = debitCard;
    }
    public void pay(int amt ){
        System.out.println("Paying through debit card "+ amt);
    }

}