import java.awt.event.ActionEvent;

public class ActionEvent_3 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "command");
        long timestamp = event.getWhen();
        System.out.println("Timestamp of the event: " + timestamp);
    }
}
