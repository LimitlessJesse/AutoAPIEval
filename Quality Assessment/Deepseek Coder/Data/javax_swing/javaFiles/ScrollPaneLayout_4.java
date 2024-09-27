import javax.swing.*;
import java.awt.*;

public class ScrollPaneLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 40);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(150, 100));

        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);

        // Get the layout manager of the scroll pane
        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();

        // Layout the components in the scroll pane
        layout.layoutContainer(scrollPane);
    }
}
