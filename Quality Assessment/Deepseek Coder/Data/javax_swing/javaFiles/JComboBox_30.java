import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_30 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox comboBox = new JComboBox(items);
        comboBox.setActionCommand("comboBoxAction");
        panel.add(comboBox);

        JLabel label = new JLabel("Select an item");
        panel.add(label);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand();
                if (actionCommand.equals("comboBoxAction")) {
                    int selectedIndex = comboBox.getSelectedIndex();
                    String selectedItem = (String) comboBox.getItemAt(selectedIndex);
                    label.setText("You selected: " + selectedItem);
                }
            }
        });

        frame.setVisible(true);
    }
}
