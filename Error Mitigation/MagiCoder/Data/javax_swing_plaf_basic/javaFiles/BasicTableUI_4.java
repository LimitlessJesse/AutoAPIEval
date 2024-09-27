import javax.swing.*;
import javax.swing.plaf.basic.BasicTableUI;
import java.awt.*;

public class BasicTableUI_4 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        BasicTableUI tableUI = new BasicTableUI();
        tableUI.installUI(table);

        // Create a JFrame to display the table
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(table);
        frame.pack();
        frame.setVisible(true);

        // Paint the table
        Graphics g = table.getGraphics();
        tableUI.paint(g, table);
    }
}
