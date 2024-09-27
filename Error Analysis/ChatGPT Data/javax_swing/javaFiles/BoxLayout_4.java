import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Component;

public class BoxLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        
        panel.add(button1);
        panel.add(button2);
        
        Component[] components = panel.getComponents();
        
        for(Component component : components){
            panel.addLayoutComponent(component.getName(), component);
        }
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
