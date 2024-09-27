import java.awt.Container;
import java.awt.Button;

public class Container_8 {
    public static void main(String[] args) {
        Container container = new Container();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        container.add(button1);
        container.add(button2);
        container.add(button3);

        container.remove(1); // Removes the second button

        // Now, the container only contains button1 and button3
        System.out.println(container.getComponentCount()); // Outputs: 2
    }
}
