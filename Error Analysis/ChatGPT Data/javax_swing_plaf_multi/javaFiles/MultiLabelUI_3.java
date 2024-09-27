import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiLabelUI;

public class MultiLabelUI_3 {
    public static void main(String[] args) {
        JComponent c = new JComponent() {
            // Implement methods of JComponent
        };
        int x = 10;
        int y = 20;
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        boolean containsComponent = multiLabelUI.contains(c, x, y);
        System.out.println("Contains component: " + containsComponent);
    }
}
