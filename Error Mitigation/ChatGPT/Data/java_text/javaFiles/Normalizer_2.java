import java.text.Normalizer;

public class Normalizer_2 {
    public static void main(String[] args) {
        CharSequence src = "Café";
        Normalizer.Form form = Normalizer.Form.NFC;
        
        boolean normalized = Normalizer.isNormalized(src, form);
        System.out.println("Is normalized: " + normalized);
    }
}
