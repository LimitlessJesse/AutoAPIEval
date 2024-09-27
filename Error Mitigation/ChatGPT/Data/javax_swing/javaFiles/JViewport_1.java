import javax.swing.JViewport;
import javax.swing.JButton;

public class JViewport_1 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        JButton button = new JButton("Click me");
        
        viewport.setView(button);
        
        System.out.println("Viewport's view set to: " + viewport.getView());
    }
}
