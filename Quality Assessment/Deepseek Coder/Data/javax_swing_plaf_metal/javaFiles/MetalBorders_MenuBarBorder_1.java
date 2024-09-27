import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_MenuBarBorder_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Edit"));
        menuBar.add(new JMenu("View"));

        MetalBorders.MenuBarBorder border = new MetalBorders.MenuBarBorder();
        border.paintBorder(menuBar, frame.getGraphics(), 0, 0, menuBar.getWidth(), menuBar.getHeight());

        frame.setVisible(true);
    }
}
