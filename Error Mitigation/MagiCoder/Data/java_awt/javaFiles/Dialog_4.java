import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dialog_4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(300, 300);
        frame.setVisible(true);

        Dialog dialog = new Dialog(frame, "Dialog", true);
        dialog.setSize(200, 200);

        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dialog.setVisible(false);
            }
        });

        dialog.setVisible(true);
    }
}
