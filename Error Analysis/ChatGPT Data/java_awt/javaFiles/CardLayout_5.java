import java.awt.*;
import javax.swing.*;

public class CardLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        JPanel panel = new JPanel();
        CardLayout layout = new CardLayout();
        
        panel.setLayout(layout);
        
        panel.add(new JLabel("Card 1"), "card1");
        panel.add(new JLabel("Card 2"), "card2");
        
        layout.show(panel, "card2"); // Show the last added component
        
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
