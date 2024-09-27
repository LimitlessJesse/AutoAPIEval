import javax.swing.text.AbstractDocument;

public class AbstractDocument_2 {
    public static void main(String[] args) {
        AbstractDocument document = new AbstractDocument() {
            @Override
            public int getLength() {
                // Your implementation of getLength() method here
                return super.getLength();
            }
        };

        // Call getLength() method
        int length = document.getLength();
        System.out.println("Length of document: " + length);
    }
}
