import java.awt.Container;
import java.awt.Button;

public class Container_4 {
    public static void main(String[] args) {
        Container container = new Container();
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        
        container.add(button1);
        container.add(button2);
        
        System.out.println("Before removeAll(): " + container.getComponentCount());
        
        container.removeAll();
        
        System.out.println("After removeAll(): " + container.getComponentCount());
    }
}
