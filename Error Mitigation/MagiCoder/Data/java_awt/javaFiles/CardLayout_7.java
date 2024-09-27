import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayout_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cardPanel = new JPanel(new CardLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        cardPanel.add(button1, "1");
        cardPanel.add(button2, "2");

        frame.getContentPane().add(cardPanel);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(cardPanel.getLayout());
                cl.show(cardPanel, "2");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(cardPanel.getLayout());
                cl.show(cardPanel, "1");
            }
        });

        frame.pack();
        frame.setVisible(true);

        // Remove the second card
        cardPanel.removeLayoutComponent(button2);
    }
}
