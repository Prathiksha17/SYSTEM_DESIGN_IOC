class Students implements Observer{
    private String name;
    public Students(String name){
        this.name = name;
    }

    public void update(String msg){
        System.out.println(name +": I have recieved Notifications ->"+ msg);
    }

}

// Observer obsr = new Students();
// obsr.update("you are a good student");