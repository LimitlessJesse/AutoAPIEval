import org.omg.CORBA.CompletionStatus;

public class CompletionStatus_1 {
    public static void main(String[] args) {
        CompletionStatus status = CompletionStatus.COMPLETED_YES;
        int value = status.value();
        System.out.println("Completion status value: " + value);
    }
}
