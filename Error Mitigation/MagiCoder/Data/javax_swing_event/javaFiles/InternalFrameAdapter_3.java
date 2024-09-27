import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                // This method is called when the internal frame is being closed.
                // You can override the close operation here.
                System.out.println("Internal frame is closing...");
            }
        });

        frame.add(internalFrame);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
