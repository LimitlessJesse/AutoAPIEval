import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                // Your code here
            }
        });

        frame.add(internalFrame);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
