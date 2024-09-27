import java.awt.dnd.DragSourceContext;

public class DragSourceContext_1 {
    public static void main(String[] args) {
        // Create an instance of DragSourceContext
        DragSourceContext dsc = new DragSourceContext(null);
        
        // Get the component associated with the DragSourceContext
        Component component = dsc.getComponent();
        
        // Output the component
        System.out.println("Component: " + component);
    }
}
