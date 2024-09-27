import org.omg.CORBA.CompletionStatus;
import org.omg.CORBA.CompletionStatusHelper;

import java.io.InputStream;

public class CompletionStatusHelper_4 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        
        CompletionStatus status = CompletionStatusHelper.read(inputStream);
        
        System.out.println("CompletionStatus value: " + status);
    }
}
