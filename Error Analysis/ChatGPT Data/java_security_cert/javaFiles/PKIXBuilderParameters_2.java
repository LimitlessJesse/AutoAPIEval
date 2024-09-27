import java.security.cert.PKIXBuilderParameters;

public class PKIXBuilderParameters_2 {
    public static void main(String[] args) {
        PKIXBuilderParameters params = new PKIXBuilderParameters(null, null);
        int maxLength = params.getMaxPathLength();
        System.out.println("Max Path Length: " + maxLength);
    }
}
