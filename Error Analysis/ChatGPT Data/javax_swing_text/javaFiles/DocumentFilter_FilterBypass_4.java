import javax.swing.text.DocumentFilter.FilterBypass;

public class DocumentFilter_FilterBypass_4 {
    public static void main(String[] args) {
        FilterBypass fb = new FilterBypass() {
            @Override
            public Document getDocument() {
                return null;
            }

            @Override
            public void remove(int offset, int length) {}

            @Override
            public void insertString(int offset, String string, AttributeSet attr) {}
        };
    }
}
