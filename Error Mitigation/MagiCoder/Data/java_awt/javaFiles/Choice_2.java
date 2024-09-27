import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Choice_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Choice Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        panel.add(comboBox);

        frame.setVisible(true);
    }
}
