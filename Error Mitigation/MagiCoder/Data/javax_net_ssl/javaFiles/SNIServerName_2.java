import javax.net.ssl.SNIServerName;
import java.util.Arrays;

public class SNIServerName_2 {
    public static void main(String[] args) {
        SNIServerName serverName = new SNIServerName("example.com");
        System.out.println(serverName.hashCode());
    }
}
