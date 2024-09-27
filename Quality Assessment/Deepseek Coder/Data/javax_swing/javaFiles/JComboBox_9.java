import javax.swing.JComboBox;

public class JComboBox_9 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");
        
        int itemCount = comboBox.getItemCount();
        System.out.println("Number of items in the JComboBox: " + itemCount);
    }
}
