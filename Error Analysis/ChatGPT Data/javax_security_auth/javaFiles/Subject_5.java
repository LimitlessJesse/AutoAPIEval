import javax.security.auth.Subject;

public class Subject_5 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        // Set the Subject as read-only
        subject.setReadOnly(true);
    }
}
