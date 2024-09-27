import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class DropTarget_3 {
    public static void main(String[] args) {
        DropTarget dt = new DropTarget();
        dt.addDropTargetListener(new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
                Point point = dtde.getLocation();
                System.out.println("Drag over at: " + point);
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
                System.out.println("Drag exit");
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();
                try {
                    String data = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                    System.out.println("Dropped: " + data);
                } catch (UnsupportedFlavorException | IOException ex) {
                    ex.printStackTrace();
                }
                dtde.dropComplete(true);
            }
        });
    }
}
