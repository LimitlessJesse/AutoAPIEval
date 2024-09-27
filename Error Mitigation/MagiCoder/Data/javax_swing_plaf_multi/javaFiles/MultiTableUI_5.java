import javax.swing.*;
import javax.swing.plaf.multi.MultiTableUI;
import java.awt.*;

public class MultiTableUI_5 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        MultiTableUI multiTableUI = new MultiTableUI();
        multiTableUI.update(table.getGraphics(), table);
    }
}
