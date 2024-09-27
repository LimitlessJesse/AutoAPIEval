import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        BasicScrollPaneUI basicUI = new BasicScrollPaneUI();
        basicUI.installListeners(scrollPane);
    }
}
