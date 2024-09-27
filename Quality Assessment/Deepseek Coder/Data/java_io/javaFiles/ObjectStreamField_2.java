import java.io.ObjectStreamField;

public class ObjectStreamField_2 {
    private static final ObjectStreamField[] serialFields = {
        new ObjectStreamField("name", String.class)
    };

    private String name;

    public ObjectStreamField_2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ObjectStreamField_2 main = new ObjectStreamField_2("Hello");
        System.out.println(serialFields[0].getName()); // prints "name"
        System.out.println(main.getName()); // prints "Hello"
    }
}
