import org.omg.CORBA.TypeCodePackage.TypeCode;
import org.omg.CORBA_2_3.portable.IDLTypeCode;

public class TypeCode_3 {
    public static void main(String[] args) {
        IDLTypeCode tc = TypeCode.tc_string();
        String id = tc.id();
        System.out.println("The ID of the type code is: " + id);
    }
}
