import java.awt.event.ActionEvent;

public class ActionEvent_4 {
    public static void main(String[] args) {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Button Clicked");
        String paramString = event.paramString();
        System.out.println("Parameter String: " + paramString);
    }
}
