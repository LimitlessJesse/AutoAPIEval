import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                // Your code here
                System.out.println("Internal frame deactivated");
            }
        });
        frame.add(internalFrame);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
