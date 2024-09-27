import org.omg.CORBA.TypeCode;
import org.omg.CORBA.TCF;

public class TypeCode_4 {
    public static void main(String[] args) {
        TypeCode tc = TCF.STRING_TC;
        System.out.println(tc.name());
    }
}
