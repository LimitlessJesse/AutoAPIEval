import org.xml.sax.ext.Attributes2Impl;

public class Attributes2Impl_5 {
    public static void main(String[] args) {
        Attributes2Impl attributes = new Attributes2Impl();
        boolean declared = attributes.isDeclared("qName");
        System.out.println("Is declared: " + declared);
    }
}
