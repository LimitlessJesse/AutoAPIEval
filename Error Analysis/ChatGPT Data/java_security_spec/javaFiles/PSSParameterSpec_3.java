import java.security.spec.PSSParameterSpec;

public class PSSParameterSpec_3 {
    public static void main(String[] args) {
        PSSParameterSpec pss = new PSSParameterSpec(20, "MGF1", null, 32, 1);
        int trailerField = pss.getTrailerField();
        System.out.println("Trailer Field: " + trailerField);
    }
}
