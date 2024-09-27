import org.omg.CORBA.CompletionStatus;

public class CompletionStatus_3 {
    public static void main(String[] args) {
        int i = 1;
        CompletionStatus status = CompletionStatus.from_int(i);
        System.out.println(status.value());
    }
}
