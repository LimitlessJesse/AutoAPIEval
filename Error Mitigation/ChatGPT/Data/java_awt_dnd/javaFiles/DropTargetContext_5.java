import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.DropTargetContext;

public class DropTargetContext_5 {
    public static void main(String[] args) {
        DropTargetContext context = new DropTargetContext();
        try {
            context.dropComplete(true);
            System.out.println("Drop completed successfully");
        } catch (InvalidDnDOperationException e) {
            System.out.println("Drop operation is not outstanding");
        }
    }
}
