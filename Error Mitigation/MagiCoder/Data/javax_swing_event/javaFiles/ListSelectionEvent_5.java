import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import javax.swing.DefaultListModel;

public class ListSelectionEvent_5 {
    public static void main(String[] args) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        JList<String> list = new JList<>(listModel);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Perform action when selection is finalized
                    System.out.println("Selection finalized: " + list.getSelectedValue());
                }
            }
        });
    }
}
