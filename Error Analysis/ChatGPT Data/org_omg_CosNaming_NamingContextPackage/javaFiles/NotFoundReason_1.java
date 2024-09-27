import org.omg.CosNaming.NamingContextPackage.NotFoundReason;

public class NotFoundReason_1 {
    public static void main(String[] args) {
        NotFoundReason reason = NotFoundReason.alreadyBound;
        int value = reason.value();
        System.out.println("The int value of NotFoundReason is: " + value);
    }
}
