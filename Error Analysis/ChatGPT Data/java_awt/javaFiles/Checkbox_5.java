import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.ItemEvent;
import java.awt.ItemListener;

public class Checkbox_5 {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Example");
        Checkbox checkbox = new Checkbox("Check Me");

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox state changed");
            }
        });

        frame.add(checkbox);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
