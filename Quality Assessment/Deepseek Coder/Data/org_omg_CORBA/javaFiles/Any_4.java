import org.omg.CORBA.Any;
import org.omg.CORBA.OctetSeq;
import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;

public class Any_4 {
    public static void main(String[] args) {
        // Initialize the ORB
        ORB orb = ORB.init(args, null);

        try {
            // Create a new Any object
            Any any = orb.create_any();

            // Create a new OctetSeq object
            OctetSeq octetSeq = new OctetSeq(1);

            // Insert an octet into the OctetSeq
            octetSeq.insert_octet(0, (byte) 123);

            // Insert the OctetSeq into the Any
            any.insert_any(0, octetSeq);

            // Print the Any
            System.out.println(any);
        } catch (InvalidName e) {
            e.printStackTrace();
        }
    }
}
