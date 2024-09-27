import java.text.Normalizer;

public class Normalizer_2 {
    public static void main(String[] args) {
        String text = "légèreté";
        Normalizer.Form form = Normalizer.Form.NFD;
        
        boolean isNormalized = Normalizer.isNormalized(text, form);
        
        if (isNormalized) {
            System.out.println("The text is normalized.");
        } else {
            System.out.println("The text is not normalized.");
        }
    }
}
