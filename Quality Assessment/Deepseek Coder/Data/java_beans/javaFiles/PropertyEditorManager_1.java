import java.beans.PropertyEditorManager;
import java.beans.PropertyEditor;

public class PropertyEditorManager_1 {
    public static void main(String[] args) {
        Class<?> type = String.class;
        PropertyEditor editor = PropertyEditorManager.findEditor(type);
        System.out.println(editor);
    }
}
