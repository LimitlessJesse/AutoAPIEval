import javax.swing.text.html.parser.TagElement;

public class TagElement_4 {
    public static void main(String[] args) {
        TagElement tagElement = new TagElement();
        boolean result = tagElement.breaksFlow();
        System.out.println("Does the tag break flow? " + result);
    }
}
