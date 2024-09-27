import javax.activation.ActivationDataFlavor;

public class ActivationDataFlavor_2 {
    public static void main(String[] args) {
        ActivationDataFlavor dataFlavor = new ActivationDataFlavor(String.class, "text/plain");
        String mimeType = dataFlavor.getMimeType();
        System.out.println("MIME Type: " + mimeType);
    }
}
