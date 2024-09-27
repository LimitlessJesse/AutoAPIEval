import javax.swing.*;

public class ToolTipManager_2 {
    public static void main(String[] args) {
        JComponent component = new JLabel("Hello, World!");
        ToolTipManager.registerComponent(component);
        ToolTipManager.unregisterComponent(component);
    }
}
