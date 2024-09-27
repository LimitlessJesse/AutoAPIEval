import javax.net.ssl.SNIHostName;

public class SNIHostName_4 {
    public static void main(String[] args) {
        SNIHostName sniHostName = new SNIHostName("example.com");
        int hashCode = sniHostName.hashCode();
        System.out.println("Hash code for SNIHostName: " + hashCode);
    }
}
