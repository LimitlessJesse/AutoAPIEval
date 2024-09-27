import javax.swing.DefaultSingleSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DefaultSingleSelectionModel_3 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultSingleSelectionModel selectionModel = (DefaultSingleSelectionModel) list.getSelectionModel();

        // Adding elements to the JList
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Selecting the first element
        selectionModel.setSelectionInterval(0, 0);

        // Printing the selected element
        System.out.println("Selected element: " + list.getSelectedValue());

        // Clearing the selection
        selectionModel.clearSelection();

        // Printing the selected element after clearing the selection
        System.out.println("Selected element after clearing the selection: " + list.getSelectedValue());
    }
}
