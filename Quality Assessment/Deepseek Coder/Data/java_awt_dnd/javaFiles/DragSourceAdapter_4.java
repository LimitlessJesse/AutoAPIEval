import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragSourceAdapter_4 {
    public static void main(String[] args) {
        DragSource dragSource = DragSource.getDefaultDragSource();
        DropTarget dropTarget = new DropTarget();

        dropTarget.addDropTargetListener(new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();
                try {
                    String data = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                    System.out.println("Dropped data: " + data);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                dtde.dropComplete(true);
            }
        });

        JLabel label = new JLabel("Drag me");
        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                DragSource ds = DragSource.getDefaultDragSource();
                ds.startDrag(new DragGestureEvent(e.getSource(), e.getID(), e.getWhen(), e.getModifiers(), e.getPoint(), new DragSourceStub()), new DragSourceAdapter() {
                    @Override
                    public void dragExit(DragSourceDragEvent dsde) {
                        System.out.println("Drag exited");
                    }

                    @Override
                    public void dropActionChanged(DragSourceDragEvent dsde) {
                        System.out.println("Drop action changed: " + dsde.getDropAction());
                    }
                });
            }
        });

        JFrame frame = new JFrame("Drag and Drop Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
