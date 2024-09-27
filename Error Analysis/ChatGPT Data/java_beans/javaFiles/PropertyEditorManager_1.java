import java.beans.PropertyEditorManager;
import java.beans.PropertyEditorSupport;

public class PropertyEditorManager_1 {
    public static void main(String[] args) {
        PropertyEditorManager.registerEditor(String.class, CustomStringPropertyEditor.class);
        
        PropertyEditorSupport editor = PropertyEditorManager.findEditor(String.class);
        System.out.println("Registered editor for String class: " + editor);
    }
}

class CustomStringPropertyEditor extends PropertyEditorSupport {
    // Custom implementation of String property editor
}
