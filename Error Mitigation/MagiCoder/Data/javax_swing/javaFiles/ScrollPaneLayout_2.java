import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        scrollPane.setViewportView(panel);
        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        Dimension preferredSize = layout.preferredLayoutSize(scrollPane);
        System.out.println("Preferred size: " + preferredSize);
    }
}
