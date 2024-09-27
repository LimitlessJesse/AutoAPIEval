import java.awt.event.WindowEvent;

public class WindowEvent_2 {
    public static void main(String[] args) {
        WindowEvent event = new WindowEvent(null, WindowEvent.WINDOW_STATE_CHANGED);
        int newState = event.getNewState();
        System.out.println("New Window State: " + newState);
    }
}
