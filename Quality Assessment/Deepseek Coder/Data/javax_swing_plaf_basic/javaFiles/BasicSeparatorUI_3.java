import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.Dimension;

public class BasicSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // create a mock component
        Dimension minSize = BasicSeparatorUI.getMinimumSize(component);
        System.out.println("Minimum width: " + minSize.width);
        System.out.println("Minimum height: " + minSize.height);
    }
}
