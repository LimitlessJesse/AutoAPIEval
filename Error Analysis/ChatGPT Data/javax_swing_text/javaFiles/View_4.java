import javax.swing.text.View;

public class View_4 {
    public static void main(String[] args) {
        // Create a new view
        View parentView = new View(null); // Passing null as argument for simplicity
        
        // Get the child view at index 0
        View childView = parentView.getView(0);
        
        // Print out the child view
        System.out.println(childView);
    }
}
