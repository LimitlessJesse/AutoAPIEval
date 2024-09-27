import java.awt.Event;

public class Event_2 {
    public static void main(String[] args) {
        Event event = new Event(null, 0, null);
        String paramString = event.paramString();
        System.out.println("Event parameters: " + paramString);
    }
}
