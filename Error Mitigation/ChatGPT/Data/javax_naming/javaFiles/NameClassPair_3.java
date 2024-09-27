import javax.naming.NameClassPair;

public class NameClassPair_3 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("example", "com.example.Class");
        boolean relative = pair.isRelative();
        System.out.println("Is relative: " + relative);
    }
}
