import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_1 {
    public static void main(String[] args) {
        CustomEditorSupport editor = new CustomEditorSupport();
        editor.setValue("Hello");
        System.out.println(editor.getValue());
    }
}

class CustomEditorSupport extends PropertyEditorSupport {
    @Override
    public void setValue(Object value) {
        super.setValue(value);
        setValue(value);
    }
}
