import java.util.EventObject;

public class EventObject_2 {
    public static void main(String[] args) {
        EventObject event = new EventObject(this);
        System.out.println(event.toString());
    }
}
