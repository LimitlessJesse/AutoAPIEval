import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox_5 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("My Checkbox");
        
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox state changed");
            }
        });
    }
}
