import javax.swing.*;
import java.awt.event.*;

public class JComboBox_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedItem = (String) combo.getSelectedItem();
                System.out.println("Selected Item: " + selectedItem);
            }
        });

        frame.getContentPane().add(comboBox);
        frame.setVisible(true);
    }
}
