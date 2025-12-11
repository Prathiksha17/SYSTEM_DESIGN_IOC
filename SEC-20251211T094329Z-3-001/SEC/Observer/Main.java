class Main{
    public static void main(String [] args){
        Students Tharan = new Students("Tharan");
        Students Pratiksha = new Students("Pratiksha");
        Students Kirmal = new Students("Kirmal");
        Students Karthik = new Students("Karthik");
        Students Tanish = new Students("Tanish");
        Students Sam = new Students("Sam");
        NotificationService WhatsApp = new NotificationService();
        WhatsApp.subscribe(Sam);
        WhatsApp.subscribe(Karthik);
        WhatsApp.subscribe(Tanish);
        WhatsApp.subscribe(Pratiksha);
        WhatsApp.unsusbcribe(Sam);
        WhatsApp.sendNotification("Chill at your home");

    }
}