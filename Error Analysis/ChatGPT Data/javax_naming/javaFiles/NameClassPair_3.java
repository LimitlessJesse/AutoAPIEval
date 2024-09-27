import javax.naming.NameClassPair;

public class NameClassPair_3 {
    public static void main(String[] args) {
        NameClassPair pair = new NameClassPair("example", "com.example.ClassName");
        String className = pair.getClassName();
        System.out.println("Class Name: " + className);
    }
}
