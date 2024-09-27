import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;

public class DropTargetAdapter_5 extends DropTargetAdapter {
    
    public static void main(String[] args) {
        // Instantiate an object of Main class
        Main main = new Main();
        
        // Simulate a DropTargetDragEvent to test the dropActionChanged method
        DropTargetDragEvent dtde = new DropTargetDragEvent(null, null, 0, 0);
        
        // Call the dropActionChanged method
        main.dropActionChanged(dtde);
    }
    
    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {
        System.out.println("Drop action changed");
    }
}
