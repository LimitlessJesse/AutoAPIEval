import java.awt.AWTEvent;

public class AWTEvent_5 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(null, 0);
        System.out.println(event.isConsumed());
    }
}
