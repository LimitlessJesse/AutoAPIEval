import java.beans.EventHandler;

public class EventHandler_4 {
    public static void main(String[] args) {
        EventHandler eventHandler = new EventHandler(new Object(), "action", "target");
        String action = eventHandler.getAction();
        System.out.println("Action: " + action);
    }
}
