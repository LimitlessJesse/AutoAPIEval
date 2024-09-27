import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

public class ScrollPaneLayout_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        ScrollPaneLayout layout = (ScrollPaneLayout) scrollPane.getLayout();
        layout.syncWithScrollPane(scrollPane);
    }
}
