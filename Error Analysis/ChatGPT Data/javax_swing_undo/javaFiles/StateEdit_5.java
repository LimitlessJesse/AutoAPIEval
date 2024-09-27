import javax.swing.undo.StateEdit;

public class StateEdit_5 {
    public static void main(String[] args) {
        StateEdit stateEdit = new StateEdit("Presentation Name");
        String presentationName = stateEdit.getPresentationName();
        System.out.println("Presentation Name: " + presentationName);
    }
}
