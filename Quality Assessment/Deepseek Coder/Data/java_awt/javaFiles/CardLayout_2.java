import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(cardLayout);

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        panel1.add(new JButton("Button 1"));
        panel1.add(new JButton("Button 2"));
        contentPane.add(panel1, "Panel 1");

        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.add(new JButton("Button 3"));
        panel2.add(new JButton("Button 4"));
        contentPane.add(panel2, "Panel 2");

        cardLayout.layoutContainer(contentPane);

        frame.pack();
        frame.setVisible(true);
    }
}
