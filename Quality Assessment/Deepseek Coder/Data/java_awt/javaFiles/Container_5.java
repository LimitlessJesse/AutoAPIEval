import java.awt.Container;
import java.awt.Button;
import java.awt.FlowLayout;

public class Container_5 {
    public static void main(String[] args) {
        Container container = new Container();
        container.setLayout(new FlowLayout());

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        container.add(button1);
        container.add(button2);
        container.add(button3);

        Component[] components = container.getComponents();

        for (Component component : components) {
            System.out.println(component.getClass().getName());
        }
    }
}
