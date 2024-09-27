import javax.swing.text.html.parser.Element;

public class Element_3 {
    public static void main(String[] args) {
        Element element = new Element();
        ContentModel contentModel = element.getContent();
        System.out.println(contentModel);
    }
}
