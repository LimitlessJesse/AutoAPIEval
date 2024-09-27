import javax.naming.NameClassPair;

public class NameClassPair_5 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("example", "com.example.ExampleClass");
        pair.setClassName("com.example.NewExampleClass");
        System.out.println(pair.getClassName());
    }
}
