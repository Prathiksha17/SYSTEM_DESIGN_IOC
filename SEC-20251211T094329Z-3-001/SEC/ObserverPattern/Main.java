class Main{
    public static void main(String[] args) {
        YourApp swiggy = new YourApp("Swiggy");
        Client ramesh = new Client("Ramesh");
        Client suresh = new Client("Suresh");

        swiggy.AddClient(ramesh);
        swiggy.AddClient(ramesh);
        swiggy.sendNotification("A new coupon has been added in your account");
        
    }
}