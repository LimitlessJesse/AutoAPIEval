import javax.swing.JTextField;
import javax.swing.undo.UndoableEdit;
import javax.swing.undo.UndoableEditListener;
import javax.swing.undo.UndoableEditSupport;

public class UndoableEditSupport_20 {
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

        textField.addActionListener(e -> {
            String text = textField.getText();
            undoSupport.postEdit(new UndoableEdit() {
                @Override
                public void undo() {
                    textField.setText("");
                }

                @Override
                public void redo() {
                    textField.setText(text);
                }

                @Override
                public boolean isSignificant() {
                    return true;
                }

                @Override
                public String getPresentationName() {
                    return "Text edit";
                }

                @Override
                public String getUndoPresentationName() {
                    return "Undo text edit";
                }

                @Override
                public String getRedoPresentationName() {
                    return "Redo text edit";
                }
            });
        });
    }
}
