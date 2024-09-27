import javax.security.auth.Subject;

public class Subject_3 {
    public static void main(String[] args) {
        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        
        boolean areEqual = subject1.equals(subject2);
        System.out.println("Subjects are equal: " + areEqual);
    }
}
