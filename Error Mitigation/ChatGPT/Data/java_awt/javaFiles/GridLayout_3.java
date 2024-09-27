import java.awt.GridLayout;
import java.awt.Button;
import java.awt.Frame;

public class GridLayout_3 {
    public static void main(String[] args) {
        Frame frame = new Frame("GridLayout Example");
        frame.setLayout(new GridLayout(2, 2));
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        
        GridLayout layout = (GridLayout) frame.getLayout();
        layout.setHgap(10);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
