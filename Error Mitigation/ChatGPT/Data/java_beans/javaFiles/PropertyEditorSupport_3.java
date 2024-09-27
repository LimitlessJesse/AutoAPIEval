import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_3 {
    public static void main(String[] args) {
        CustomPropertyEditor editor = new CustomPropertyEditor();
        System.out.println(editor.getAsText());
    }

    static class CustomPropertyEditor extends PropertyEditorSupport {
        @Override
        public String getAsText() {
            return "Property Value";
        }
    }
}
