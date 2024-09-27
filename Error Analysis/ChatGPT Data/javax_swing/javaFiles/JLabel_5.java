import javax.swing.*;

public class JLabel_5 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Example");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        JFrame frame = new JFrame();
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
