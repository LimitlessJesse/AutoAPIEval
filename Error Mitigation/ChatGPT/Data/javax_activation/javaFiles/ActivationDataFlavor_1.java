import javax.activation.ActivationDataFlavor;

public class ActivationDataFlavor_1 {
    public static void main(String[] args) {
        ActivationDataFlavor dataFlavor = new ActivationDataFlavor(String.class, "text/plain");
        String mimeType = "text/plain";
        boolean isMimeTypeEqual = dataFlavor.isMimeTypeEqual(mimeType);
        System.out.println("Is MIME type equal: " + isMimeTypeEqual);
    }
}
