import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Arrays;

public class DefaultListSelectionModel_12 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3", "Item 4", "Item 5"));

        // Get the DefaultListSelectionModel
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the anchor selection index
        selectionModel.setAnchorSelectionIndex(1);

        // Add a ListSelectionListener
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Anchor selection index: " + selectionModel.getAnchorSelectionIndex());
                    System.out.println("Lead selection index: " + selectionModel.getLeadSelectionIndex());
                }
            }
        });
    }
}
