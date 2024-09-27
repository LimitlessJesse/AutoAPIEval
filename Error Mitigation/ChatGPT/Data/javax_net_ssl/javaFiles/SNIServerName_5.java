import javax.net.ssl.SNIServerName;

public class SNIServerName_5 {
    public static void main(String[] args) {
        SNIServerName serverName = // create an instance of SNIServerName
        int hashCode = serverName.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
