import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Container_5 {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Container Example");
        Container container = frame;
        
        // Set the layout manager to FlowLayout
        container.setLayout(new FlowLayout());
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
