import java.security.spec.ECFieldF2m;

public class ECFieldF2m_2 {
    public static void main(String[] args) {
        ECFieldF2m ecFieldF2m = new ECFieldF2m(10);
        int m = ecFieldF2m.getM();
        System.out.println("The value of m is: " + m);
    }
}
