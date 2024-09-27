import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Button;
import java.awt.Frame;

public class FlowLayout_3 {
    public static void main(String[] args) {
        Frame frame = new Frame("Flow Layout Example");
        frame.setLayout(new FlowLayout());
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        frame.add(button1);
        frame.add(button2);
        
        // Set vertical gap between components
        ((FlowLayout)frame.getLayout()).setVgap(20);
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
