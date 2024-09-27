import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class InternalFrameAdapter_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Internal Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setLocation(50, 50);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                System.out.println("Internal frame is closing");
            }
        });

        frame.getContentPane().add(internalFrame);
        frame.setVisible(true);
    }
}
