import java.lang.reflect.Constructor;

public class Constructor_4 {
    public static void main(String[] args) {
        Constructor<?> constructor = Constructor_4.class.getConstructor();
        String name = constructor.getName();
        System.out.println("Constructor name: " + name);
    }
}
