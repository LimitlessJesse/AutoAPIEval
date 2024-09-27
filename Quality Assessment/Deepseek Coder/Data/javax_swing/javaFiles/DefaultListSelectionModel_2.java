import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Arrays;

public class DefaultListSelectionModel_2 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Use the addSelectionInterval method
        selectionModel.addSelectionInterval(1, 3);

        // Print the selected indices
        for (int i = 0; i < list.getModel().getSize(); i++) {
            if (selectionModel.isSelectedIndex(i)) {
                System.out.println("Index " + i + " is selected");
            }
        }
    }
}
