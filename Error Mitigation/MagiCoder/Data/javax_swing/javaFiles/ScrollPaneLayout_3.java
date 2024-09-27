import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_3 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200, 200));
        scrollPane.setViewportView(new JTextArea());

        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        Dimension minSize = layout.minimumLayoutSize(scrollPane);

        System.out.println("Minimum Layout Size: " + minSize);
    }
}
