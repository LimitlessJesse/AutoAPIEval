import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_Iterator_5 {
    public static void main(String[] args) {
        HTMLDocument.Iterator iterator = new HTMLDocument.Iterator();
        int endOffset = iterator.getEndOffset();
        System.out.println("End Offset: " + endOffset);
    }
}
