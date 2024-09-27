import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

public class BasicSeparatorUI_2 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        separator.setUI(new BasicSeparatorUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                // Your custom painting code here
            }
        });
    }
}
