import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.*;

public class DragSourceAdapter_2 {
    public static void main(String[] args) {
        DragSource ds = DragSource.getDefaultDragSource();
        DragSourceAdapter dsa = new DragSourceAdapter() {
            public void dragOver(DragSourceDragEvent dsde) {
                System.out.println("Drag over event occurred");
            }
        };
        ds.createDefaultDragGestureRecognizer(new MyTransferable(), dsa);
    }
}

class MyTransferable implements Transferable {
    public DataFlavor[] getTransferDataFlavors() {
        return new DataFlavor[0];
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return false;
    }

    public Object getTransferData(DataFlavor flavor) {
        return null;
    }
}
