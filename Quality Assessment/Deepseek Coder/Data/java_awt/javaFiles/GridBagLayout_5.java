import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Button;
import java.awt.Container;

public class GridBagLayout_5 {
    public static void main(String[] args) {
        // Create a new GridBagLayout
        GridBagLayout layout = new GridBagLayout();

        // Create a new Container
        Container container = new Container();

        // Set the layout of the container to the GridBagLayout
        container.setLayout(layout);

        // Create a new Button
        Button button = new Button("Click me");

        // Create a new GridBagConstraints
        GridBagConstraints constraints = new GridBagConstraints();

        // Add the button to the container using the GridBagLayout
        layout.setConstraints(button, constraints);
        container.add(button);

        // Remove the button from the container using the removeLayoutComponent method
        layout.removeLayoutComponent(button);
        container.remove(button);
    }
}
