import org.omg.CosNaming.NamingContextPackage.NotFoundReason;

public class NotFoundReason_1 {
    public static void main(String[] args) {
        NotFoundReason reason = NotFoundReason.not_context;
        int value = reason.value();
        System.out.println("Value of NotFoundReason: " + value);
    }
}
