import javax.crypto.spec.PBEKeySpec;

public class PBEKeySpec_4 {
    public static void main(String[] args) {
        // Create a PBEKeySpec object
        PBEKeySpec pbeKeySpec = new PBEKeySpec("password".toCharArray());
        
        // Get the iteration count
        int iterationCount = pbeKeySpec.getIterationCount();
        
        // Print the iteration count
        System.out.println("Iteration Count: " + iterationCount);
    }
}
