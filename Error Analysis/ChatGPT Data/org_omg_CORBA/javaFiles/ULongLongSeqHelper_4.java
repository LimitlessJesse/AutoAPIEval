import org.omg.CORBA.ULongLongSeqHelper;

public class ULongLongSeqHelper_4 {
    public static void main(String[] args) {
        long[] data = {1234567890, 9876543210};
        ULongLongSeqHelper idHelper = new ULongLongSeqHelper();
        String idString = idHelper.id();
        System.out.println("ID String: " + idString);
    }
}
