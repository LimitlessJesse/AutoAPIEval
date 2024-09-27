import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_Iterator_1 {
    public static void main(String[] args) {
        HTMLDocument.Iterator iterator = new HTMLDocument.Iterator();
        boolean isValid = iterator.isValid();
        System.out.println("Is iterator currently representing an occurrence of a tag? " + isValid);
    }
}
