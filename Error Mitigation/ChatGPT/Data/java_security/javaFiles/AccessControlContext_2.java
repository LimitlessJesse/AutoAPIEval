import java.security.AccessControlContext;
import java.security.DomainCombiner;

public class AccessControlContext_2 {
    public static void main(String[] args) {
        AccessControlContext acc = new AccessControlContext(null);
        DomainCombiner domainCombiner = acc.getDomainCombiner();
        System.out.println("DomainCombiner: " + domainCombiner);
    }
}
