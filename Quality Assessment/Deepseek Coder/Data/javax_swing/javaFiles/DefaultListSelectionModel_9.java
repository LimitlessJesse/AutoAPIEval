import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DefaultListSelectionModel_9 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();

        // Create a DefaultListSelectionModel
        DefaultListSelectionModel dl = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the selection mode
        dl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add a ListSelectionListener
        dl.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedIndex = list.getSelectedIndex();
                    System.out.println("Selected index: " + selectedIndex);
                }
            }
        });

        // Add items to the JList
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                list.clearSelection();
                int selectedIndex = list.getSelectedIndex();
                dl.setSelectionInterval(selectedIndex, selectedIndex);
            }
        });
    }
}
