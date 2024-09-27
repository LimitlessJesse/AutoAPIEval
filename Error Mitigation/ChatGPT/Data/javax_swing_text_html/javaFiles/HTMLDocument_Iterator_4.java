import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_Iterator_4 {
    public static void main(String[] args) {
        HTMLDocument.Iterator iterator = new HTMLDocument.Iterator();
        int startOffset = iterator.getStartOffset();
        System.out.println("Start offset: " + startOffset);
    }
}
