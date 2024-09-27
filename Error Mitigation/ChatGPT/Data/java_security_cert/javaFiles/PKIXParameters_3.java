import java.security.cert.PKIXParameters;
import java.util.Date;

public class PKIXParameters_3 {
    public static void main(String[] args) {
        PKIXParameters params = new PKIXParameters();
        Date date = new Date();
        params.setDate(date);
        System.out.println("Certification path validity time set to: " + params.getDate());
    }
}
