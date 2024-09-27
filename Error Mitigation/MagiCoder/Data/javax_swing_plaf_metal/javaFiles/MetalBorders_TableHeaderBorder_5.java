import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;
import java.awt.Insets;

public class MetalBorders_TableHeaderBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(10, 10);
        frame.add(table);
        frame.setSize(300, 300);
        frame.setVisible(true);

        TableHeaderBorder border = new TableHeaderBorder();
        Insets insets = new Insets(0, 0, 0, 0);
        border.getBorderInsets(table, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
