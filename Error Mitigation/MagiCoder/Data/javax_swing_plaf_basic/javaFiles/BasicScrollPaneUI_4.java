import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        BasicScrollPaneUI basicScrollPaneUI = new BasicScrollPaneUI();
        basicScrollPaneUI.installUI(scrollPane);
    }
}
