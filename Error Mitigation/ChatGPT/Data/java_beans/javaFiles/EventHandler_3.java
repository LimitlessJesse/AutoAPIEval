import java.beans.EventHandler;

public class EventHandler_3 {
    public static void main(String[] args) {
        Object target = new Object();
        EventHandler eventHandler = new EventHandler(target, "methodName", "eventObject");
        Object targetObject = eventHandler.getTarget();
        System.out.println("Target object: " + targetObject);
    }
}
