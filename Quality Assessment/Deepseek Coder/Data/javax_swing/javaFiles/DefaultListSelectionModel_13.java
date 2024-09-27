import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import java.util.Arrays;

public class DefaultListSelectionModel_13 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));

        // Get the DefaultListSelectionModel from the JList
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) list.getSelectionModel();

        // Set the selection indices
        selectionModel.setSelectionInterval(1, 2);

        // Get the anchor selection index
        int anchorIndex = selectionModel.getAnchorSelectionIndex();

        // Print the anchor selection index
        System.out.println("Anchor selection index: " + anchorIndex);
    }
}
