import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.dnd.InvalidDnDOperationException;
import java.io.IOException;

public class DropTarget_4 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        dropTarget.addDropTargetListener(new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                try {
                    dtde.acceptDrop(DnDConstants.ACTION_COPY);
                    Transferable t = dtde.getTransferable();
                    DataFlavor[] flavors = t.getTransferDataFlavors();
                    for (DataFlavor flavor : flavors) {
                        if (flavor.isFlavorJavaFileListType()) {
                            System.out.println(t.getTransferData(flavor));
                        }
                    }
                    dtde.dropComplete(true);
                } catch (IOException | InvalidDnDOperationException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
