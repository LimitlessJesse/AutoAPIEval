import org.xml.sax.ext.Attributes2Impl;

public class Attributes2Impl_1 {
    public static void main(String[] args) {
        Attributes2Impl attributes = new Attributes2Impl();
        boolean isDeclared = attributes.isDeclared(0);
        System.out.println("Attribute at index 0 is declared: " + isDeclared);
    }
}
