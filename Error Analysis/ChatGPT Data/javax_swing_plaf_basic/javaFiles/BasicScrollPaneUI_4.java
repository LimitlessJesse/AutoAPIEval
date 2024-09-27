import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_4 {
    public static void main(String[] args) {
        // Instantiate a JScrollPane
        JScrollPane scrollPane = new JScrollPane();

        // Call the installListeners method
        BasicScrollPaneUI ui = new BasicScrollPaneUI();
        ui.installListeners(scrollPane);
    }
}
