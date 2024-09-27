import javax.security.auth.Subject;
import java.security.Principal;
import java.util.Set;

public class Subject_2 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Set<Principal> principals = subject.getPrincipals();
        // Perform operations with the Set of Principals
    }
}
