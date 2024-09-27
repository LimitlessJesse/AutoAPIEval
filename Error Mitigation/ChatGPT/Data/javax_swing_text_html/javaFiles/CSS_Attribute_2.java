import javax.swing.text.html.CSS;

public class CSS_Attribute_2 {
    public static void main(String[] args) {
        CSS.Attribute attribute = CSS.Attribute.FONT_FAMILY;
        boolean inherited = attribute.isInherited();
        System.out.println("Is attribute inherited? " + inherited);
    }
}
