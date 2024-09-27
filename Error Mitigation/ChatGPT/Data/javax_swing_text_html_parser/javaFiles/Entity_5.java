import javax.swing.text.html.parser.Entity;

public class Entity_5 {
    public static void main(String[] args) {
        Entity entity = new Entity();
        boolean isParameter = entity.isParameter();
        System.out.println("Is it a parameter entity? " + isParameter);
    }
}
