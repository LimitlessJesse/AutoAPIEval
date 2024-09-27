import java.awt.*;
import javax.swing.*;

public class CardLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        JPanel panel = new JPanel();

        CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        JButton button1 = new JButton("Card 1");
        JButton button2 = new JButton("Card 2");
        JButton button3 = new JButton("Card 3");

        panel.add(button1, "Card 1");
        panel.add(button2, "Card 2");
        panel.add(button3, "Card 3");

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        cardLayout.show(panel, "Card 2");
    }
}
