import java.awt.AWTEvent;

public class AWTEvent_3 {
    public static void main(String[] args) {
        AWTEvent event = new AWTEvent(new Object(), 0) {
            @Override
            protected void consume() {
                super.consume();
                System.out.println("Event consumed");
            }
        };
        
        event.consume();
    }
}
