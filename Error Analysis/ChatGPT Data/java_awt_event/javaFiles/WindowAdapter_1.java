import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapter_1 {
    public static void main(String[] args) {
        MyWindowAdapter adapter = new MyWindowAdapter();
        adapter.windowOpened(new WindowEvent(new java.awt.Frame(), WindowEvent.WINDOW_OPENED));
    }

    static class MyWindowAdapter extends WindowAdapter {
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window Opened");
        }
    }
}
