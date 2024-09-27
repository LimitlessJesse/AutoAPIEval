import java.text.Normalizer;

public class Normalizer_1 {
    public static void main(String[] args) {
        CharSequence src = "héllo";
        Normalizer.Form form = Normalizer.Form.NFD;
        
        String normalizedString = Normalizer.normalize(src, form);
        System.out.println(normalizedString);
    }
}
