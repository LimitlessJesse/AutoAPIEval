import java.awt.event.ActionEvent;

public class ActionEvent_2 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(new Object(), 1, "Command");
        int modifiers = event.getModifiers();
        System.out.println("Modifiers: " + modifiers);
    }
}
