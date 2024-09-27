import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Component_1 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public void addNotify() {
                super.addNotify();
                System.out.println("Component added to the event queue");
            }
        };

        component.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        component.setSize(300, 200);
        component.setVisible(true);
    }
}
