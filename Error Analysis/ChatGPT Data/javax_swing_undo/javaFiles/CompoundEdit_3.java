import javax.swing.undo.CompoundEdit;

public class CompoundEdit_3 {
    public static void main(String[] args) {
        CompoundEdit compoundEdit = new CompoundEdit();
        boolean isInProgress = compoundEdit.isInProgress();
        System.out.println("Is in progress: " + isInProgress);
    }
}
