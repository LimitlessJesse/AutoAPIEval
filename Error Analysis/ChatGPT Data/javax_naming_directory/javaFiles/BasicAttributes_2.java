import javax.naming.directory.BasicAttributes;

public class BasicAttributes_2 {
    public static void main(String[] args) {
        BasicAttributes attributes = new BasicAttributes();
        attributes.put("attr1", "value1");
        
        String attrValue = (String) attributes.get("attr1");
        System.out.println("Attribute value: " + attrValue);
    }
}
