import javax.security.auth.Subject;

public class Subject_5 {
    public static void main(String[] args) {
        Subject subject = new Subject();
        boolean isReadOnly = subject.isReadOnly();
        System.out.println("Is read-only: " + isReadOnly);
    }
}
