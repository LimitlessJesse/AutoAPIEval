import javax.naming.directory.BasicAttribute;

public class BasicAttribute_2 {
    public static void main(String[] args) {
        BasicAttribute attribute = new BasicAttribute("id", "123");
        String id = attribute.getID();
        System.out.println("ID: " + id);
    }
}
