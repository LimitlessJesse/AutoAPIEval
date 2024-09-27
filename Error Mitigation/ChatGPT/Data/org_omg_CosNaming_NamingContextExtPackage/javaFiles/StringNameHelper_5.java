import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StringNameHelper_5 {
    public static void main(String[] args) {
        org.omg.CORBA.TypeCode typeCode = StringNameHelper.type();
        System.out.println("Type code: " + typeCode);
    }
}
