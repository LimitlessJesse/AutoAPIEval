import java.awt.event.InputEvent;

public class InputEvent_2 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0, 0);
        long timestamp = event.getWhen();
        System.out.println("Timestamp of the event: " + timestamp);
    }
}
