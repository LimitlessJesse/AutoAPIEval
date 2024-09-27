import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DropTargetAdapter_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drag and Drop Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            private static final long serialVersionUID = 1L;

            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                System.out.println("Mouse moved");
            }
        };

        panel.setTransferHandler(new TransferHandler() {
            private static final long serialVersionUID = 1L;

            @Override
            public boolean canImport(TransferSupport support) {
                return support.isDataFlavorSupported(DataFlavor.stringFlavor);
            }

            @Override
            public boolean importData(TransferSupport support) {
                try {
                    String data = (String) support.getTransferable().getTransferData(DataFlavor.stringFlavor);
                    System.out.println("Imported data: " + data);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
        });

        DropTarget dropTarget = new DropTarget(panel, new DropTargetAdapter() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
                dtde.acceptDrag(DnDConstants.ACTION_COPY);
            }
        });

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
