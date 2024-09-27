import javax.swing.text.html.parser.TagElement;

public class TagElement_5 {
    public static void main(String[] args) {
        TagElement tagElement = new TagElement();
        boolean preformatted = tagElement.isPreformatted();
        System.out.println("Is preformatted: " + preformatted);
    }
}
