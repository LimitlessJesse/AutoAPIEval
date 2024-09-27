import java.awt.event.WindowEvent;

public class WindowEvent_1 {
    public static void main(String[] args) {
        WindowEvent event = new WindowEvent(null, WindowEvent.WINDOW_STATE_CHANGED);
        int oldState = event.getOldState();
        System.out.println("Previous window state: " + oldState);
    }
}
