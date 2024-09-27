import javax.security.auth.Subject;

public class SubjectDomainCombiner_2 {
    public static void main(String[] args) {
        SubjectDomainCombiner sdc = new SubjectDomainCombiner();
        Subject subject = sdc.getSubject();
        if (subject != null) {
            System.out.println("Subject found: " + subject.toString());
        } else {
            System.out.println("No Subject associated with this SubjectDomainCombiner.");
        }
    }
}
