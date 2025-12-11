import java.util.*;
class YourApp {
    private List<Observer> clients = new ArrayList<>();
    private String appName;
    public YourApp(String appName){
        this.appName = appName;
    }
    public void AddClient(Observer client){
        clients.add(client);
        System.out.println("new client has been added for Notifications..");
    }
    public void removeClient( Observer client){
        clients.remove(client);
        System.out.println("client has removed from Notifications.." );
    }

    public void sendNotification( String message){
        for(Observer client : clients ){
            client.sentNotifications(message);
        }
    }
}