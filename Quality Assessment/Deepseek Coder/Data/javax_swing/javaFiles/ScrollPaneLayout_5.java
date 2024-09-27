import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));

        JPanel panel = new JPanel();
        panel.setBackground(Color.RED);
        panel.setPreferredSize(new Dimension(300, 300));

        scrollPane.setViewportView(panel);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        layout.removeLayoutComponent(panel);
    }
}
