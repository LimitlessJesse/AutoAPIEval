import java.awt.event.InputEvent;

public class InputEvent_4 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent(null, 0, 0, 0, 0, 0, 0, false);
        long eventTime = event.getWhen();
        System.out.println("Event time: " + eventTime);
    }
}
