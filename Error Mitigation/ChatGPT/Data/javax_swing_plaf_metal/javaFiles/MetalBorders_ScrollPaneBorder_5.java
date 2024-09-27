import javax.swing.plaf.metal.MetalBorders;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Insets;

public class MetalBorders_ScrollPaneBorder_5 {
    public static void main(String[] args) {
        MetalBorders.ScrollPaneBorder scrollPaneBorder = new MetalBorders.ScrollPaneBorder();
        JScrollPane scrollPane = new JScrollPane();
        Insets insets = new Insets(0, 0, 0, 0);
        scrollPaneBorder.getBorderInsets(scrollPane, insets);
        System.out.println("Insets: " + insets);
    }
}
