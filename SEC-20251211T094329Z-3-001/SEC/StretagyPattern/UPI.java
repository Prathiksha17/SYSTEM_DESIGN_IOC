class UPI implements PaymentStrategy{
    private String UPI_ID ;

    public UPI( String UPI_ID){
        this.UPI_ID = UPI_ID;
    }

    public void pay( int amt){
        System.out.println("Paying using UPI_ID and Amt is: " +amt);
    }

}