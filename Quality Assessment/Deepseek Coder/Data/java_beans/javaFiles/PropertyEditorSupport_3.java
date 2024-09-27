import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_3 {
    public static void main(String[] args) {
        CustomEditorSupport editor = new CustomEditorSupport();
        editor.setAsText("Hello");
        System.out.println(editor.getValue());
    }
}

class CustomEditorSupport extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(text);
    }
}
