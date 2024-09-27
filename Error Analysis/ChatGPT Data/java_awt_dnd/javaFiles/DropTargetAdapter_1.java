import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetAdapter;

public class DropTargetAdapter_1 {
    public static void main(String[] args) {
        
    }
    
    public void dragEnter(DropTargetDragEvent dtde) {
        if (dtde.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            try {
                String draggedData = (String) dtde.getTransferable().getTransferData(DataFlavor.stringFlavor);
                System.out.println("Dragged data: " + draggedData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
