import javax.swing.JScrollPane;
import javax.swing.plaf.multi.MultiScrollPaneUI;
import java.awt.Graphics;

public class MultiScrollPaneUI_5 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        MultiScrollPaneUI multiScrollPaneUI = new MultiScrollPaneUI();
        Graphics g = scrollPane.getGraphics();
        multiScrollPaneUI.update(g, scrollPane);
    }
}
