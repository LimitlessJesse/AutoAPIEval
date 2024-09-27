import java.awt.AWTEvent;

public class MyEvent extends AWTEvent {
    public MyEvent(Object source, int id) {
        super(source, id);
    }

    @Override
    public void consume() {
        super.consume();
        // Your custom code here
    }
}
