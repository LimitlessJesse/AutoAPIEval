import javax.swing.*;
import java.awt.*;

public class ToolTipManager_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tooltip Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Hover me");
        button.setToolTipText("This is a tooltip");

        ToolTipManager.registerComponent(button);

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
