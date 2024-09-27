import javax.swing.text.html.parser.Element;

public class Element_2 {
    public static void main(String[] args) {
        Element element = new Element("div");
        String name = element.getName();
        System.out.println("Name of the element: " + name);
    }
}
