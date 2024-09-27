import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragSourceAdapter_3 {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Drag and Drop Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new label
        JLabel label = new JLabel("Drag here");
        frame.add(label);

        // Create a new DragSource
        DragSource dragSource = Toolkit.getDefaultToolkit().getSystemDragSource();

        // Add a DragSourceListener to the label
        label.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                // Create a Transferable object
                StringSelection selection = new StringSelection("Hello, World!");

                // Start the drag
                dragSource.startDrag(new DragGestureEvent(e.getSource(), e.getID(), e.getWhen(), e.getModifiers(), e.getPoint(), selection, null, null), new DragSourceAdapter() {
                    @Override
                    public void dragExit(DragSourceDragEvent dsde) {
                        System.out.println("Drag exit");
                    }
                });
            }
        });

        // Add a DropTargetListener to the frame
        frame.setDropTarget(new DropTarget() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                // Accept the drop
                dtde.acceptDrop(DnDConstants.ACTION_MOVE);

                // Get the Transferable object
                Transferable transferable = dtde.getTransferable();

                // Get the data from the Transferable object
                try {
                    String data = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                    System.out.println("Received: " + data);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Drop was successful
                dtde.dropComplete(true);
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}
