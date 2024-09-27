import javax.swing.JComboBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JComboBox_25 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        // Set the selected item
        comboBox.setSelectedItem("Item 2");

        // Add a ListSelectionListener to the combo box
        comboBox.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Selected item: " + comboBox.getSelectedItem());
                }
            }
        });
    }
}
