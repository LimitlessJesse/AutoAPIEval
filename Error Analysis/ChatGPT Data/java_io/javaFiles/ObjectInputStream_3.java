import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_3 implements Serializable {
    private String name;
    private int age;

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
    }

    public static void main(String[] args) {
        Main obj = new Main("John", 25);
        System.out.println("Object Created: " + obj.name + ", " + obj.age);
    }
}
