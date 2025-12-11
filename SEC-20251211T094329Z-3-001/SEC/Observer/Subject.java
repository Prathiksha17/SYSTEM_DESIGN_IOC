interface Subject{
    void subscribe(Observer obsr);
    void unsusbcribe(Observer obsr);
    void sendNotification(String msg);
}