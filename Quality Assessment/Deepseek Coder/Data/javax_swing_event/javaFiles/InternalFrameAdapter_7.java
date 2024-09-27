import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setLocation(50, 50);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                System.out.println("Internal frame has been opened.");
            }
        });

        frame.getContentPane().add(internalFrame);
        frame.setVisible(true);
    }
}
