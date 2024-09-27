import javax.swing.text.html.parser.Element;

public class Element_5 {
    public static void main(String[] args) {
        Element element = new Element();
        boolean result = element.omitStart();
        System.out.println("Can start tag be omitted? " + result);
    }
}
