import javax.swing.JComboBox;

public class JComboBox_4 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");

        System.out.println("Before removing items: " + comboBox.getItemCount());
        
        comboBox.removeAllItems();
        
        System.out.println("After removing items: " + comboBox.getItemCount());
    }
}
