import java.awt.event.ActionEvent;

public class ActionEvent_2 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "show details");
        String command = event.getActionCommand();
        System.out.println("Command: " + command);
    }
}
