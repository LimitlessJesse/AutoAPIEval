import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DragSourceAdapter_2 {
    public static void main(String[] args) {
        DragSource ds = Toolkit.getDefaultToolkit().getSystemDragSource();
        final String[] transferData = {"Hello, World!"};

        ds.createDefaultDragGestureRecognizer(new DragSourceAdapter() {
            public void dragGestureRecognized(DragSourceDragEvent dsde) {
                try {
                    dsde.startDrag(new DragSourceDropEvent(dsde, dsde.getX(), dsde.getY(),
                            dsde.getDropAction(), new Transferable() {
                                public Object getTransferData(DataFlavor df) {
                                    if (isDataFlavorSupported(df)) {
                                        return transferData[0];
                                    } else {
                                        throw new UnsupportedFlavorException(df);
                                    }
                                }

                                public DataFlavor[] getTransferDataFlavors() {
                                    return new DataFlavor[]{DataFlavor.stringFlavor};
                                }

                                public boolean isDataFlavorSupported(DataFlavor df) {
                                    return df.equals(DataFlavor.stringFlavor);
                                }
                            }, null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, DnDConstants.ACTION_MOVE);

        final JLabel label = new JLabel("Drag me");
        label.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                ds.startDrag(new DragSourceDragEvent(ds, e.getX(), e.getY(), e.getModifiers(),
                        new Transferable() {
                            public Object getTransferData(DataFlavor df) {
                                if (isDataFlavorSupported(df)) {
                                    return transferData[0];
                                } else {
                                    throw new UnsupportedFlavorException(df);
                                }
                            }

                            public DataFlavor[] getTransferDataFlavors() {
                                return new DataFlavor[]{DataFlavor.stringFlavor};
                            }

                            public boolean isDataFlavorSupported(DataFlavor df) {
                                return df.equals(DataFlavor.stringFlavor);
                            }
                        }, null));
            }
        });

        JFrame frame = new JFrame("Drag and Drop Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
