import javax.swing.text.html.parser.Entity;

public class Entity_1 {
    public static void main(String[] args) {
        Entity entity = new Entity("TestEntity", false);
        String name = entity.getName();
        System.out.println("Entity Name: " + name);
    }
}
