import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class DropTargetContext_2 {
    public static void main(String[] args) {
        DropTarget dropTarget = new DropTarget();
        dropTarget.createDefaultDragGestureRecognizer(
                new DropTargetAdapter() {
                    public void drop(DropTargetDropEvent dtde) {
                        Transferable t = dtde.getTransferable();
                        try {
                            String data = (String) t.getTransferData(DataFlavor.stringFlavor);
                            System.out.println("Dropped: " + data);
                            dtde.acceptDrop(DnDConstants.ACTION_COPY);
                            dtde.getDropTargetContext().dropComplete(true);
                        } catch (UnsupportedFlavorException | IOException e) {
                            e.printStackTrace();
                            dtde.rejectDrop();
                        }
                    }
                },
                true,
                new DropTargetListener() {
                    public void drop(DropTargetDropEvent dtde) {
                    }

                    public void dragEnter(DropTargetDragEvent dtdge) {
                    }

                    public void dragExit(DropTargetEvent dte) {
                    }

                    public void dragOver(DropTargetDragEvent dtdge) {
                    }

                    public void dropActionChanged(DropTargetDragEvent dtdge) {
                    }

                    public void dropComplete(DropTargetDropEvent dtde) {
                    }

                    public void outOfDropMode(DropTargetEvent dte) {
                    }

                    public void dragExit(DropTargetContext dtc) {
                    }

                    public void dragEnter(DropTargetContext dtc) {
                    }

                    public void dragOver(DropTargetContext dtc) {
                    }

                    public void dropComplete(DropTargetContext dtc, boolean success) {
                        if (success) {
                            System.out.println("Drop completed successfully");
                        } else {
                            System.out.println("Drop completed with failure");
                        }
                    }
                });
    }
}
