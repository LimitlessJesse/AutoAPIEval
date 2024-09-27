import javax.swing.*;
import javax.swing.plaf.multi.MultiScrollPaneUI;

public class MultiScrollPaneUI_2 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        MultiScrollPaneUI multiScrollPaneUI = new MultiScrollPaneUI();
        multiScrollPaneUI.installUI(scrollPane);
    }
}
