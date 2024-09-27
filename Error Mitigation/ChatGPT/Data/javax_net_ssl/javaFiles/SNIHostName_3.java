import javax.net.ssl.SNIHostName;

public class SNIHostName_3 {
    public static void main(String[] args) {
        SNIHostName sniHostName1 = new SNIHostName("example.com");
        SNIHostName sniHostName2 = new SNIHostName("Example.com");

        boolean isEqual = sniHostName1.equals(sniHostName2);
        System.out.println("Are the server names equal? " + isEqual);
    }
}
