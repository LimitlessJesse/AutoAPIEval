import java.awt.event.ActionEvent;

public class ActionEvent_4 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Button Clicked");
        long eventTime = event.getWhen();
        System.out.println("Event occurred at: " + eventTime);
    }
}
