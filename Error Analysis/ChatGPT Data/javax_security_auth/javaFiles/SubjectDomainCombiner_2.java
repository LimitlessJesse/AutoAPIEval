import javax.security.auth.Subject;
import javax.security.auth.SubjectDomainCombiner;

public class SubjectDomainCombiner_2 {
    public static void main(String[] args) {
        SubjectDomainCombiner domainCombiner = new SubjectDomainCombiner(new Subject());
        System.out.println(domainCombiner.getSubject());
    }
}
