import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DropTarget_4 {
    public static void main(String[] args) {
        DropTarget dt = new DropTarget();
        dt.addDropTargetListener(new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();
                if (transferable.isDataFlavorSupported(DataFlavor.fileListFlavor)) {
                    try {
                        List<File> files = (List<File>) transferable.getTransferData(DataFlavor.fileListFlavor);
                        for (File file : files) {
                            System.out.println(file.getAbsolutePath());
                        }
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
                dtde.dropComplete(true);
            }
        });

        // Remove the listener
        dt.removeDropTargetListener(new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();
                if (transferable.isDataFlavorSupported(DataFlavor.fileListFlavor)) {
                    try {
                        List<File> files = (List<File>) transferable.getTransferData(DataFlavor.fileListFlavor);
                        for (File file : files) {
                            System.out.println(file.getAbsolutePath());
                        }
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
                dtde.dropComplete(true);
            }
        });
    }
}
