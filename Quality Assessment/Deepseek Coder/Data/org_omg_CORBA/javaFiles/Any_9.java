import org.omg.CORBA.Any;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.ORB;

public class Any_9 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        Any any = orb.create_any();
        any.insert_string("Hello, World!");
        TypeCode tc = any.type();
        System.out.println(tc.toString());
    }
}
