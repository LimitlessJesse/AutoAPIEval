import javax.naming.NameClassPair;

public class NameClassPair_2 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("example", "com.example.ExampleClass");
        boolean result = pair.isRelative();
        System.out.println("Is relative: " + result);
    }
}
