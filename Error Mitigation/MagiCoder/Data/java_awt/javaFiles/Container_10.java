import java.awt.Container;
import java.awt.Button;

public class Container_10 {
    public static void main(String[] args) {
        Container container = new Container();
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");

        // Adding buttons to the container
        container.add(button1);
        container.add(button2);

        // Printing the buttons
        System.out.println("Before removing: " + container.getComponents());

        // Removing all components from the container
        container.removeAll();

        // Printing the buttons after removing
        System.out.println("After removing: " + container.getComponents());
    }
}
