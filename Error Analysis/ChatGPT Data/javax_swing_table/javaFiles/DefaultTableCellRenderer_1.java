import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;

public class DefaultTableCellRenderer_1 {
    public static void main(String[] args) {
        
    }

    private Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        return renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
