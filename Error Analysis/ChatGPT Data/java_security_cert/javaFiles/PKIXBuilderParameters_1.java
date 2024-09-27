import java.security.cert.PKIXBuilderParameters;

public class PKIXBuilderParameters_1 {
    public static void main(String[] args) {
        // Create PKIXBuilderParameters object
        PKIXBuilderParameters params = new PKIXBuilderParameters(null, null);

        // Set the maximum path length
        params.setMaxPathLength(5);

        // Get the maximum path length
        int maxPathLength = params.getMaxPathLength();
        
        System.out.println("Maximum Path Length: " + maxPathLength);
    }
}
