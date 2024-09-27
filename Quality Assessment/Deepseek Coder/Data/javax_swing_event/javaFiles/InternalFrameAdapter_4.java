import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setLocation(50, 50);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("Internal frame deactivated");
            }
        });

        frame.add(internalFrame);
        frame.setVisible(true);
    }
}
