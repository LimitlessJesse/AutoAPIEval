import javax.naming.NameClassPair;

public class NameClassPair_2 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("example", "com.example.ExampleClass");
        String className = pair.getClassName();
        System.out.println("Class name: " + className);
    }
}
