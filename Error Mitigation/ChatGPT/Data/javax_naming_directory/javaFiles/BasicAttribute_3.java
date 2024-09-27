import javax.naming.directory.BasicAttribute;

public class BasicAttribute_3 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("exampleAttribute");
        attribute.add("value1");
        attribute.add("value2");
        
        int size = attribute.size();
        System.out.println("Size of attribute: " + size);
    }
}
