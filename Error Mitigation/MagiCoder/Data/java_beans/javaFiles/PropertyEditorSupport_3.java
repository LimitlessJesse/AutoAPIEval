import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_3 {
    public static void main(String[] args) {
        MyPropertyEditor editor = new MyPropertyEditor();
        editor.setAsText("123");
        System.out.println(editor.getValue());  // Output: 123
    }
}

class MyPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(Integer.parseInt(text));
    }
}
