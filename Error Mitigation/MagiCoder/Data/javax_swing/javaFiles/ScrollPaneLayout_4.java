import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JPanel viewport = new JPanel();
        scrollPane.setViewportView(viewport);

        JLabel label = new JLabel("Hello, World!");
        viewport.add(label);

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        layout.layoutContainer(scrollPane);
    }
}
