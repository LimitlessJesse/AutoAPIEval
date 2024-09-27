import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_2 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setValue("Hello");
        System.out.println(editor.getValue());
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text);
    }
}
