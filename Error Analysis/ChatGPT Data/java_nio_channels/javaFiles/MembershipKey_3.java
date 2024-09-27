import java.nio.channels.*;

public class MembershipKey_3 {
    public static void main(String[] args) {
        // Creating a MembershipKey object
        MembershipKey key = null;

        // Checking if the MembershipKey is valid
        boolean isValid = key.isValid();
        System.out.println("Is MembershipKey valid? " + isValid);
    }
}
