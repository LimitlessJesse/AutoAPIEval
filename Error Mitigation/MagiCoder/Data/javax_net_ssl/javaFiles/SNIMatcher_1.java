import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SNIMatcher;

public class SNIMatcher_1 {
    public static void main(String[] args) {
        SNIHostName hostName = new SNIHostName("www.example.com");
        SNIServerName serverName = new SNIServerName(hostName);

        SNIMatcher matcher = new SNIMatcher() {
            @Override
            public boolean matches(SNIServerName serverName) {
                return this.serverName.equals(serverName);
            }
        };

        boolean result = matcher.matches(serverName);
        System.out.println("Matches: " + result);
    }
}
