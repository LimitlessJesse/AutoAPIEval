import javax.naming.NameClassPair;

public class NameClassPair_1 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("exampleName", "exampleClassName");
        String name = pair.getName();
        System.out.println("Name of the binding: " + name);
    }
}
