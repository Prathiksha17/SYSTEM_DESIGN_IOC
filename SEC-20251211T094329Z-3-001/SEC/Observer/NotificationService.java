import java.util.*;
class NotificationService implements Subject{
    private List<Observer> subscribers = new ArrayList<>();
    public void subscribe(Observer obsr){
        subscribers.add(obsr);
    }
    public void unsusbcribe(Observer obsr){
        subscribers.remove(obsr);
    }
    public void sendNotification(String msg){
        for(Observer obsr: subscribers){
            obsr.update(msg);
        }
    }
}