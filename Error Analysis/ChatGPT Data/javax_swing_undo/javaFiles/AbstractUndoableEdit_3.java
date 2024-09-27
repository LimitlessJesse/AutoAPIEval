import javax.swing.undo.AbstractUndoableEdit;

public class AbstractUndoableEdit_3 {
    public static void main(String[] args) {
        // Create a new instance of AbstractUndoableEdit
        MyUndoableEdit edit = new MyUndoableEdit();
        
        // Call getPresentationName() method
        String presentationName = edit.getPresentationName();
        
        System.out.println("Presentation Name: " + presentationName);
    }
}

class MyUndoableEdit extends AbstractUndoableEdit {
    
    @Override
    public String getPresentationName() {
        return "My Undoable Edit";
    }
}
