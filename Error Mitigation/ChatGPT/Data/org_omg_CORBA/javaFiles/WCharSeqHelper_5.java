import org.omg.CORBA.WCharSeqHelper;

public class WCharSeqHelper_5 {
    public static void main(String[] args) {
        org.omg.CORBA.TypeCode typeCode = WCharSeqHelper.type();
        System.out.println("Type code: " + typeCode);
    }
}
