import java.security.cert.PKIXBuilderParameters;

public class PKIXBuilderParameters_3 {
    public static void main(String[] args) {
        PKIXBuilderParameters params = new PKIXBuilderParameters(null, null);
        int maxPathLength = 5;
        params.setMaxPathLength(maxPathLength);
        System.out.println("Max path length set to: " + params.getMaxPathLength());
    }
}
