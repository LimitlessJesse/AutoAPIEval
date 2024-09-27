import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_1 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);
        panel.add(button2);

        scrollPane.setViewportView(panel);

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        layout.addLayoutComponent(ScrollPaneConstants.VIEWPORT, panel);
    }
}
