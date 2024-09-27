import javax.net.ssl.SNIServerName;

public class SNIServerName_3 {
    public static void main(String[] args) {
        SNIServerName sniServerName1 = SNIServerName.from("example.com");
        SNIServerName sniServerName2 = SNIServerName.from("example.com");

        boolean isEqual = sniServerName1.equals(sniServerName2);

        System.out.println("Are the two SNIServerName objects equal? " + isEqual);
    }
}
