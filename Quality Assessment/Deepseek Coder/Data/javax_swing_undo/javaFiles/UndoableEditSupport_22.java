import javax.swing.JTextField;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditListener;
import javax.swing.undo.UndoableEditSupport;

public class UndoableEditSupport_22 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        UndoableEditSupport undoSupport = new UndoableEditSupport();

        undoSupport.addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                UndoableEdit edit = e.getEdit();
                System.out.println("Undoable edit happened: " + edit);
            }
        });

        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                undoSupport.postEdit(new TextEdit(textField, e.getKeyChar()));
            }
        });
    }
}
