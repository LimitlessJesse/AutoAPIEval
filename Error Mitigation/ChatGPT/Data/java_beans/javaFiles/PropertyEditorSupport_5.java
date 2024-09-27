import java.beans.PropertyEditorSupport;

public class PropertyEditorSupport_5 {
    public static void main(String[] args) {
        CustomPropertyEditor editor = new CustomPropertyEditor();
        String[] tags = editor.getTags();
        for (String tag : tags) {
            System.out.println(tag);
        }
    }

    static class CustomPropertyEditor extends PropertyEditorSupport {
        @Override
        public String[] getTags() {
            return new String[]{"Tag1", "Tag2", "Tag3"};
        }
    }
}
