import java.io.ObjectStreamClass;

public class ObjectStreamClass_1 {
    public static void main(String[] args) {
        long serialVersionUID = ObjectStreamClass.lookup(Main.class).getSerialVersionUID();
        System.out.println("SerialVersionUID: " + serialVersionUID);
    }
}
