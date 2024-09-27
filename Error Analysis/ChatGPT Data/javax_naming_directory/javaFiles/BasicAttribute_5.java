import javax.naming.directory.BasicAttribute;

public class BasicAttribute_5 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("example");
        attribute.add("value1");
        attribute.add("value2");
        
        int attributeSize = attribute.size();
        System.out.println("Size of attribute: " + attributeSize);
    }
}
