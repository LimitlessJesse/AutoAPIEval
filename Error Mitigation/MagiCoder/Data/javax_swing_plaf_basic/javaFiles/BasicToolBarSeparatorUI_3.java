import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

public class BasicToolBarSeparatorUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new BasicToolBarSeparatorUI().getPreferredSize(this);
            }
        };

        System.out.println(component.getPreferredSize());
    }
}
