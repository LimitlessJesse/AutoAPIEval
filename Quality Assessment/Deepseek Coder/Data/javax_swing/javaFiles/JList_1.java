import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JList_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(items);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton button = new JButton("Get Selected Index");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = list.getSelectedIndex();
                if (selectedIndex!= -1) {
                    String selectedItem = items[selectedIndex];
                    System.out.println("Selected Item: " + selectedItem);
                    System.out.println("Selected Index: " + selectedIndex);
                } else {
                    System.out.println("No item is selected");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(list), BorderLayout.CENTER);
        panel.add(button, BorderLayout.PAGE_END);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
