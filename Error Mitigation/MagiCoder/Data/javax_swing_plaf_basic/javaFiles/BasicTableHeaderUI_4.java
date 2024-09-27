import javax.swing.*;
import javax.swing.plaf.basic.BasicTableHeaderUI;

public class BasicTableHeaderUI_4 {
    public static void main(String[] args) {
        JTable table = new JTable();
        BasicTableHeaderUI headerUI = new BasicTableHeaderUI();
        headerUI.installUI(table);
    }
}
