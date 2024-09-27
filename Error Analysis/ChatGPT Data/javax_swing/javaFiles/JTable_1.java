import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JTable_1 {
    public static void main(String[] args) {
        JTable table = new JTable();
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Set auto resize mode to Off
        // Add table to a scroll pane and display it in a frame
        JScrollPane scrollPane = new JScrollPane(table);
        JFrame frame = new JFrame();
        frame.add(scrollPane);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
