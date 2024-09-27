import org.omg.CosNaming.NamingContextPackage.NotFoundReason;

public class NotFoundReason_3 {
    public static void main(String[] args) {
        int value = 1; // Example value
        NotFoundReason reason = NotFoundReason.from_int(value);
        System.out.println("Reason: " + reason);
    }
}
