import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DropTargetAdapter_4 {
    public static void main(String[] args) {
        DragSource dragSource = DragSourcePrototypeInstance.getDragSource();
        DropTarget dropTarget = new DropTarget();

        dropTarget.addDropTargetListener(new DropTargetAdapter() {
            @Override
            public void dragExit(DropTargetEvent dte) {
                System.out.println("Drag Exit");
            }
        });

        JLabel label = new JLabel("Drag Here");
        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                StringSelection selection = new StringSelection("Hello World");
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(selection, null);

                DragSource ds = DragSourcePrototypeInstance.getDragSource();
                ds.startDrag(new DragGestureEvent(e.getComponent(), e.getID(), e.getModifiers(), e.getX(), e.getY(), clipboard, new DropTargetContext(), ds), new DragSourceAdapter() {});
            }
        });

        JFrame frame = new JFrame();
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
