import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.ArrayList;

public class JList_5 {
    public static void main(String[] args) {
        // Create a JList
        JList<String> list = new JList<>(new ArrayList<>());

        // Add elements to the list
        list.getModel().addElement("Element 1");
        list.getModel().addElement("Element 2");
        list.getModel().addElement("Element 3");

        // Select the first element
        list.setSelectedIndex(0);

        // Print the selected index
        System.out.println("Selected index: " + list.getSelectedIndex());

        // Clear the selection
        list.clearSelection();

        // Print the selected index after clearing the selection
        System.out.println("Selected index after clearing: " + list.getSelectedIndex());
    }
}
