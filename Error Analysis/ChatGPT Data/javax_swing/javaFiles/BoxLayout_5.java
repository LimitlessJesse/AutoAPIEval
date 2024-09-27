import javax.swing.*;

public class BoxLayout_5 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a Container
        Container container = frame.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        // Add components to the container
        
        // Call the layoutContainer method to layout the components
        layoutContainer(container);
        
        // Display the frame
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void layoutContainer(Container target) {
        // This method lays out the components within the specified Container
        target.validate();
    }
}
