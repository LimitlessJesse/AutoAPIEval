import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DropTargetAdapter_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drop Target Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JComponent component = new JComponent() {
            private DropTarget dropTarget;

            @Override
            public void addNotify() {
                super.addNotify();
                dropTarget = new DropTarget(this, new DropTargetAdapter() {
                    @Override
                    public void dropActionChanged(DropTargetDragEvent dtde) {
                        super.dropActionChanged(dtde);
                        System.out.println("Drop action changed: " + dtde.getDropAction());
                    }
                });
            }

            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.drawString("Drop files here", 50, 100);
            }
        };

        frame.add(component);
        frame.setVisible(true);
    }
}
