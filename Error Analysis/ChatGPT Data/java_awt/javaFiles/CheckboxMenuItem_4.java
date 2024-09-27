import java.awt.CheckboxMenuItem;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxMenuItem_4 {
    public static void main(String[] args) {
        CheckboxMenuItem checkbox = new CheckboxMenuItem("Checkbox");
        
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Item state changed");
            }
        };
        
        checkbox.addItemListener(itemListener);
        
        // Removing the item listener
        checkbox.removeItemListener(itemListener);
    }
}
