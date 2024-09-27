import org.omg.CORBA.Any;
import org.omg.CORBA.WCharSeqHelper;

public class WCharSeqHelper_2 {
    public static void main(String[] args) {
        Any any = ...; // Initialize Any object
        char[] result = WCharSeqHelper.extract(any);
        System.out.println(result);
    }
}
