import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_1 extends ComponentAdapter {
    public static void main(String[] args) {
        ComponentAdapter_1 main = new ComponentAdapter_1();
        main.componentHidden(null);
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Component is hidden");
    }
}
