import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.*;

public class InternalFrameAdapter_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InternalFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setLocation(50, 50);

        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                System.out.println("InternalFrame is iconified");
            }
        });

        frame.setVisible(true);
    }
}
