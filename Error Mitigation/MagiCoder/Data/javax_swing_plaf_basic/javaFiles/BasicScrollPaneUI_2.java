import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.awt.*;

public class BasicScrollPaneUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));

        BasicScrollPaneUI ui = new BasicScrollPaneUI();
        ui.installUI(scrollPane);

        ui.paint(scrollPane.getGraphics(), scrollPane);

        frame.getContentPane().add(scrollPane);
        frame.setVisible(true);
    }
}
