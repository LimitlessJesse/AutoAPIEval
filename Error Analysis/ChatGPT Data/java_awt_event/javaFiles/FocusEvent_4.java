import java.awt.event.FocusEvent;

public class FocusEvent_4 {
    public static void main(String[] args) {
        FocusEvent event = new FocusEvent(component, id, temporary);
        boolean temporary = event.isTemporary();
        System.out.println("Is temporary event: " + temporary);
    }
}
