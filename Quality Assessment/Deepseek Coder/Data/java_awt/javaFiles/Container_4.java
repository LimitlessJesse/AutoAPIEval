import java.awt.Container;
import java.awt.Button;

public class Container_4 {
    public static void main(String[] args) {
        Container container = new Container();
        Button button = new Button("Click me");
        container.add(button);
        System.out.println("Before removeAll: " + container.getComponents().length);
        container.removeAll();
        System.out.println("After removeAll: " + container.getComponents().length);
    }
}
