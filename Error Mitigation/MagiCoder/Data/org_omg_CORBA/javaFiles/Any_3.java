import org.omg.CORBA.Any;
import org.omg.CORBA.AnyOperations;

public class Any_3 {
    public static void main(String[] args) {
        Any any = new Any();
        any.insert_octet((byte) 10);
    }
}
