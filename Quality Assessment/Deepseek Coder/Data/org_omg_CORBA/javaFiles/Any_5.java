import org.omg.CORBA.Any;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;

public class Any_5 {
    public static void main(String[] args) {
        ORB orb = ORB.init(args, null);
        Any any = orb.create_any();
        TypeCode tc = any.get_type();
        try {
            tc.member_name(0);
        } catch (InvalidName e) {
            e.printStackTrace();
        }
        any.insert_short(12345);
        System.out.println(any);
    }
}
