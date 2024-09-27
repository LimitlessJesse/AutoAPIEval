import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;

public class DefaultTableCellRenderer_4 {
    public static void main(String[] args) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setForeground(Color.RED);
        System.out.println("The foreground color of the renderer is: " + renderer.getForeground());
    }
}
