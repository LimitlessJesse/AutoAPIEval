import org.omg.CORBA.CompletionStatus;

public class CompletionStatus_2 {
    public static void main(String[] args) {
        int i = 1; // Example value for i
        CompletionStatus status = CompletionStatus.from_int(i);
        System.out.println(status);
    }
}
