import java.awt.CheckboxMenuItem;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxMenuItem_3 {
    public static void main(String[] args) {
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("Example CheckboxMenuItem");

        checkboxMenuItem.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Item state changed");
            }
        });
    }
}
