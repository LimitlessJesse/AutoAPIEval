import javax.swing.JComboBox;

public class JComboBox_3 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Item 1");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");
        
        System.out.println("Before removing:");
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            System.out.println(comboBox.getItemAt(i));
        }
        
        // Remove item "Item 2"
        Object itemToRemove = "Item 2";
        removeItem(comboBox, itemToRemove);
        
        System.out.println("\nAfter removing:");
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            System.out.println(comboBox.getItemAt(i));
        }
    }
    
    public static void removeItem(JComboBox comboBox, Object item) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(item)) {
                comboBox.removeItem(item);
                break;
            }
        }
    }
}
