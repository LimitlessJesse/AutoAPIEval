import javax.swing.*;
import javax.swing.plaf.multi.MultiTableHeaderUI;
import java.awt.*;

public class MultiTableHeaderUI_3 {
    public static void main(String[] args) {
        JTable table = new JTable();
        MultiTableHeaderUI headerUI = (MultiTableHeaderUI) table.getTableHeader().getUI();
        headerUI.paint(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Your custom painting code here
            }
        }.getGraphics());
    }
}
