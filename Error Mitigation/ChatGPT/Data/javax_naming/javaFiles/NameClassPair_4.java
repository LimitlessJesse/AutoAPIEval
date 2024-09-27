import javax.naming.NameClassPair;

public class NameClassPair_4 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("exampleName", "exampleClassName");
        pair.setName("newName");
        System.out.println(pair.getName());
    }
}
