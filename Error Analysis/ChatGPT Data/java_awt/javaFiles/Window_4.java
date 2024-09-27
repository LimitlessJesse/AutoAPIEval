import java.awt.Frame;

public class Window_4 {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Example");
        frame.setSize(400, 400);
        frame.setVisible(true);

        try {
            // Set visibility to false for 2 seconds
            Thread.sleep(2000);
            frame.setVisible(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
