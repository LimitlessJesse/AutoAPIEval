import java.awt.event.ActionEvent;

public class ActionEvent_3 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent("Button", ActionEvent.ACTION_PERFORMED, "Click");
        String actionCommand = event.getActionCommand();
        System.out.println("Action Command: " + actionCommand);
    }
}
