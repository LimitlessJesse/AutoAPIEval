import java.text.Normalizer;

public class Normalizer_1 {
    public static void main(String[] args) {
        String original = "héllô";
        String normalized = Normalizer.normalize(original, Normalizer.Form.NFD);
        System.out.println("Original: " + original);
        System.out.println("Normalized: " + normalized);
    }
}
