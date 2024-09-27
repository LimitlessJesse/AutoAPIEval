import javax.swing.text.html.parser.TagElement;

public class TagElement_4 {
    public static void main(String[] args) {
        TagElement tagElement = new TagElement();
        boolean breaksFlow = tagElement.breaksFlow();
        System.out.println("Does this tag element break the flow? " + breaksFlow);
    }
}
