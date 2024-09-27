import javax.swing.*;
import java.awt.*;

public class JList_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");

        JList<String> list = new JList<>(listModel);
        list.setSelectedIndex(1); // Set the second item as selected

        JScrollPane scrollPane = new JScrollPane(list);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
