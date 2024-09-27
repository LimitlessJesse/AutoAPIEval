import javax.net.ssl.SNIServerName;
import java.util.Arrays;

public class SNIServerName_5 {
    public static void main(String[] args) {
        SNIServerName sniServerName = new SNIServerName("www.example.com".getBytes());
        System.out.println(sniServerName.toString());
    }
}
