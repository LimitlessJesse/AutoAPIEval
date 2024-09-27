import javax.swing.text.html.CSS;

public class CSS_Attribute_1 {
    public static void main(String[] args) {
        CSS.Attribute attribute = new CSS.Attribute();
        boolean isInherited = attribute.isInherited("color");
        System.out.println("Is 'color' attribute inherited? " + isInherited);
    }
}
