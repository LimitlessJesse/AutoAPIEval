import java.security.spec.ECFieldF2m;

public class ECFieldF2m_1 {
    public static void main(String[] args) {
        ECFieldF2m field = new ECFieldF2m(8, 1, 2, 3);
        int m = field.getM();
        System.out.println("m: " + m);
    }
}
