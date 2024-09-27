import javax.swing.undo.CompoundEdit;

public class CompoundEdit_1 {
    public static void main(String[] args) {
        // Create a new CompoundEdit
        CompoundEdit compoundEdit = new CompoundEdit();
        
        // Perform multiple edits
        compoundEdit.addEdit(someEdit1);
        compoundEdit.addEdit(someEdit2);
        compoundEdit.addEdit(someEdit3);
        
        // End the compound edit to signify all edits have been added
        compoundEdit.end();
        
        // Undo all the edits
        compoundEdit.undo();
    }
}
