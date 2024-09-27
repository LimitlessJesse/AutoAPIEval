import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTableUI;
import java.awt.Dimension;

public class BasicTableUI_4 {
    public static void main(String[] args) {
        BasicTableUI basicTableUI = new BasicTableUI();
        JComponent component = new JComponent() {
        };
        Dimension preferredSize = basicTableUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
