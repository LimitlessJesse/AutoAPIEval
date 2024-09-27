import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        JPanel panel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        panel.add(button1, "Button 1");
        panel.add(button2, "Button 2");
        panel.add(button3, "Button 3");
        
        cardLayout.first(panel);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
