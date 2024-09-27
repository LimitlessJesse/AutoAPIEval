import javax.swing.*;
import javax.swing.event.ItemEvent;
import javax.swing.event.ItemListener;

public class JComboBox_20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Selected item: " + e.getItem());
                }
            }
        });

        frame.getContentPane().add(comboBox);
        frame.setVisible(true);
    }
}
