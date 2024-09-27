import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MouseWheelEvent_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Wheel Scroll Amount");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        scrollPane.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int scrollAmount = e.getScrollAmount();
                System.out.println("Scroll Amount: " + scrollAmount);
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}
