import java.beans.PropertyEditorSupport;
import java.util.Date;

public class PropertyEditorSupport_4 {
    public static void main(String[] args) {
        PropertyEditorSupport editor = new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(new Date(Long.parseLong(text)));
            }
        };

        editor.setAsText("1632489600000");
        System.out.println(editor.getAsText());
    }
}
