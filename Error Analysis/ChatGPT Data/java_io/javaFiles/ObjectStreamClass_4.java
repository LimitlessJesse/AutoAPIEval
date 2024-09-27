import java.io.ObjectStreamClass;

public class ObjectStreamClass_4 {
    public static void main(String[] args) {
        long serialVersionUID = ObjectStreamClass.lookup(java.util.ArrayList.class).getSerialVersionUID();
        System.out.println("SerialVersionUID of ArrayList class: " + serialVersionUID);
    }
}
