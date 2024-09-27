import java.io.ObjectStreamClass;

public class ObjectStreamClass_3 {
    public static void main(String[] args) {
        ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);
        long serialVersionUID = osc.getSerialVersionUID();
        System.out.println("SerialVersionUID for String class: " + serialVersionUID);
    }
}
