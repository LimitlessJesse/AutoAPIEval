import javax.swing.JComboBox;

public class JComboBox_3 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");

        System.out.println("Before removing:");
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            System.out.println(comboBox.getItemAt(i));
        }

        comboBox.removeItem("Option 2");

        System.out.println("After removing:");
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            System.out.println(comboBox.getItemAt(i));
        }
    }
}
