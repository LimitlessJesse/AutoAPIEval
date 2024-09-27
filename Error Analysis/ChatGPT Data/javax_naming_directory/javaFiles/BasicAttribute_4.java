import javax.naming.directory.BasicAttribute;

public class BasicAttribute_4 {
    public static void main(String[] args) {
        BasicAttribute basicAttribute = new BasicAttribute("example");
        basicAttribute.add("value1");
        basicAttribute.add("value2");
        
        System.out.println("Before clear: " + basicAttribute);
        
        basicAttribute.clear();
        
        System.out.println("After clear: " + basicAttribute);
    }
}
