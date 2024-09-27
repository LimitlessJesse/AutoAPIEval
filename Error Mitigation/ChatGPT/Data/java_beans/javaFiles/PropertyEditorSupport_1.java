import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_1 {
    public static void main(String[] args) {
        CustomPropertyEditor editor = new CustomPropertyEditor();
        editor.setValue("New value");
        System.out.println(editor.getValue());
    }

    static class CustomPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setValue(Object value) {
            super.setValue(value);
        }
    }
}
