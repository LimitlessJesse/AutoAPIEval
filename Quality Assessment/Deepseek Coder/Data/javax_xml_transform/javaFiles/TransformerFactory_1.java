import javax.xml.transform.TransformerFactory;

public class TransformerFactory_1 {
    public static void main(String[] args) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            System.out.println(tf.getFeature("http://apache.org/xml/features/disallow-doctype-decl"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
