import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;

public class ScrollPaneLayout_4 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        ScrollPaneLayout layout = new ScrollPaneLayout();
        layout.syncWithScrollPane(scrollPane);
    }
}
