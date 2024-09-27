import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemEvent_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemSelectable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JList<String> list = new JList<>();
        list.setListData(new String[] { "Item 1", "Item 2", "Item 3" });

        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println(e.getItem() + " selected");
                } else {
                    System.out.println(e.getItem() + " deselected");
                }
            }
        });

        frame.getContentPane().add(new JScrollPane(list), BorderLayout.CENTER);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
