import javax.swing.*;
import java.awt.event.*;

public class JComboBox_17 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // Handle item state change
            }
        });

        comboBox.removeItemListener(comboBox.getItemListeners()[0]);
    }
}
