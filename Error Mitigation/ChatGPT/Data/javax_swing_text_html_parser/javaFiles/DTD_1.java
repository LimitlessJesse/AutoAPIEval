import javax.swing.text.html.parser.DTD;
import javax.swing.text.html.parser.Element;

public class DTD_1 {
    public static void main(String[] args) {
        DTD dtd = new DTD();
        Element element = dtd.getElement("example");
        System.out.println(element);
    }
}
