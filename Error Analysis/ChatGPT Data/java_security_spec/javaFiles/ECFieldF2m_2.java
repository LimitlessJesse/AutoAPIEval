import java.security.spec.ECFieldF2m;

public class ECFieldF2m_2 {
    public static void main(String[] args) {
        ECFieldF2m fieldF2m = new ECFieldF2m(5, 3, 2, 1, new int[]{1, 0, 1});
        int[] midTerms = fieldF2m.getMidTermsOfReductionPolynomial();
        for (int i : midTerms) {
            System.out.print(i + " ");
        }
    }
}
