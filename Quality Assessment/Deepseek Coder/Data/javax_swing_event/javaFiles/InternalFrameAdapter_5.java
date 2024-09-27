import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InternalFrame Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                System.out.println("Internal frame deiconified");
            }
        });

        frame.getContentPane().add(internalFrame);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
