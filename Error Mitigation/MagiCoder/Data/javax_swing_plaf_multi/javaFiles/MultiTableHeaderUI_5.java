import javax.swing.*;
import javax.swing.plaf.multi.MultiTableHeaderUI;
import java.awt.*;

public class MultiTableHeaderUI_5 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        MultiTableHeaderUI multiTableHeaderUI = new MultiTableHeaderUI();
        Graphics g = table.getGraphics();
        multiTableHeaderUI.paint(g, table);
    }
}
