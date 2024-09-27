import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;

public class PropertyEditorManager_2 {
    public static void main(String[] args) {
        Class<?> targetType = String.class;
        PropertyEditor editor = PropertyEditorManager.findEditor(targetType);
        System.out.println("Editor found: " + editor);
    }
}
