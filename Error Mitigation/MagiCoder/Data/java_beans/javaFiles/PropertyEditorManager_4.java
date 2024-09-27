import java.beans.PropertyEditorManager;

public class PropertyEditorManager_4 {
    public static void main(String[] args) {
        java.beans.PropertyEditor editor = PropertyEditorManager.findEditor(String.class);
        System.out.println(editor);
    }
}
