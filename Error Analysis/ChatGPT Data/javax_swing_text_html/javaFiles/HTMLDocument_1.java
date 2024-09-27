import javax.swing.text.Element;
import javax.swing.text.html.HTMLDocument;

public class HTMLDocument_1 {
    public static void main(String[] args) {
        HTMLDocument htmlDocument = new HTMLDocument();
        Element element = htmlDocument.getElement("element_name_here");

        String newHtml = "<p>New HTML content</p>";
        setOuterHTML(element, newHtml);

        System.out.println(htmlDocument.getText(0, htmlDocument.getLength()));
    }

    public static void setOuterHTML(Element elem, String html) {
        elem.getDocument().putProperty("i18n", Boolean.TRUE);
        
        int startOffset = elem.getStartOffset();
	int endOffset = elem.getEndOffset();

	try {
	    elem.getDocument().remove(startOffset, endOffset - startOffset);
	    elem.getDocument().insertString(startOffset, html, null);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
