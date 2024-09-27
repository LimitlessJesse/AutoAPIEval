import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_4 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setValue(123);
        System.out.println(editor.getAsText());
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public String getAsText() {
        Object value = getValue();
        if (value instanceof Integer) {
            return String.valueOf(value);
        }
        return null;
    }
}
