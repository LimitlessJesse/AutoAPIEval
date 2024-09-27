import javax.swing.*;
import javax.swing.plaf.basic.BasicTableHeaderUI;
import java.awt.*;

public class BasicTableHeaderUI_2 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        BasicTableHeaderUI headerUI = new BasicTableHeaderUI();
        headerUI.paint(table.getGraphics(), table);
    }
}
