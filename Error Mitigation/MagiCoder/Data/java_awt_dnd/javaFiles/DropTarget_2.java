import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class DropTarget_2 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        dropTarget.addDropTargetListener(new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                // Implement this method if you want to handle drag enter event
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
                // Implement this method if you want to handle drag over event
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
                // Implement this method if you want to handle drop action changed event
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
                // Implement this method if you want to handle drag exit event
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                // Handle the drop event
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable t = dtde.getTransferable();
                try {
                    DataFlavor[] flavors = t.getTransferDataFlavors();
                    for (DataFlavor flavor : flavors) {
                        if (flavor.isFlavorJavaFileListType()) {
                            java.util.List<?> files = (java.util.List<?>) t.getTransferData(flavor);
                            for (Object file : files) {
                                System.out.println(file);
                            }
                        }
                    }
                } catch (UnsupportedFlavorException | IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void dropComplete(DropTargetDropEvent dtde) {
                // Implement this method if you want to handle drop complete event
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // Implement this method if you want to handle mouse moved event
            }
        });
    }
}
