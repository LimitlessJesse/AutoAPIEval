import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_4 {
    public static void main(String[] args) {
        CustomPropertyEditor editor = new CustomPropertyEditor();
        editor.setAsText("123");
    }

    static class CustomPropertyEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            try {
                int value = Integer.parseInt(text);
                setValue(value);
                System.out.println("Property value set to: " + value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid format for property value");
            }
        }
    }
}
