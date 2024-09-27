import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_3 {
    public static void main(String[] args) {
        // Create a PBEParameterSpec object
        PBEParameterSpec spec = new PBEParameterSpec(new byte[]{1, 2, 3, 4, 5, 6, 7, 8}, 10, 20);
        
        // Get the iteration count
        int iterationCount = spec.getIterationCount();
        
        // Print the iteration count
        System.out.println("Iteration Count: " + iterationCount);
    }
}
