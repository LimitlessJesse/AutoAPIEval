import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.*;

public class InternalFrameAdapter_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InternalFrameAdapter Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setLocation(50, 50);

        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);

        // Add InternalFrameAdapter to handle InternalFrameEvent.Closed event
        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("Internal frame closed");
            }
        });

        frame.setVisible(true);
    }
}
