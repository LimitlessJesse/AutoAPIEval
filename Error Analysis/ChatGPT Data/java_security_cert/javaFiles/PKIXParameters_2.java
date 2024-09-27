import java.security.cert.PKIXParameters;
import java.util.Date;

public class PKIXParameters_2 {
    public static void main(String[] args) {
        PKIXParameters params = new PKIXParameters();
        Date date = new Date();
        
        params.setDate(date);
        System.out.println("Date set successfully: " + params.getDate());
    }
}
