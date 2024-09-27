import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Arrays;

public class DefaultListSelectionModel_1 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the selection interval
        selectionModel.setSelectionInterval(1, 3);

        // Add a ListSelectionListener to print the selected indices
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    ListSelectionModel model = (ListSelectionModel) e.getSource();
                    int min = model.getMinSelectionIndex();
                    int max = model.getMaxSelectionIndex();
                    System.out.println("Selected indices: " + min + " to " + max);
                }
            }
        });
    }
}
