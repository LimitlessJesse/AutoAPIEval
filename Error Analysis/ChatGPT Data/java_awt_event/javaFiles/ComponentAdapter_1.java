import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_1 {
    public static void main(String[] args) {
        
    }
    
    class MyComponentAdapter extends ComponentAdapter {
        public void componentHidden(ComponentEvent e) {
            System.out.println("Component hidden event received");
        }
    }
}
