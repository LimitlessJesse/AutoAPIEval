import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicSeparatorUI separatorUI = new BasicSeparatorUI();
        separatorUI.installUI(component);
    }
}
