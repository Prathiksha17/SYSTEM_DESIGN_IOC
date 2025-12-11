class Client implements Observer{
    private String name;
    public Client(String name){
        this.name = name;
    }

    public void sentNotifications( String message){
        System.out.println(name +" You have a new notification " + message);
    }

}