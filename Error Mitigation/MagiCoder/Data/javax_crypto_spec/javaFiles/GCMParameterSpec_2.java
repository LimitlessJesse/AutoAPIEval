import javax.crypto.spec.GCMParameterSpec;

public class GCMParameterSpec_2 {
    public static void main(String[] args) {
        // Create a GCMParameterSpec object
        GCMParameterSpec spec = new GCMParameterSpec(128, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15});

        // Get the IV
        byte[] iv = spec.getIV();

        // Print the IV
        for (byte b : iv) {
            System.out.print(b + " ");
        }
    }
}
