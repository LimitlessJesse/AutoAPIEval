import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiViewportUI;

public class MultiViewportUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MultiViewportUI multiViewportUI = new MultiViewportUI();
        int count = multiViewportUI.getAccessibleChildrenCount(component);
        System.out.println("Accessible children count: " + count);
    }
}
