import javax.net.ssl.SNIServerName;

public class SNIServerName_1 {
    public static void main(String[] args) {
        SNIServerName sniServerName1 = new SNIServerName("example.com");
        SNIServerName sniServerName2 = new SNIServerName("example.com");
        SNIServerName sniServerName3 = new SNIServerName("example.org");

        System.out.println(sniServerName1.equals(sniServerName2)); // true
        System.out.println(sniServerName1.equals(sniServerName3)); // false
    }
}
