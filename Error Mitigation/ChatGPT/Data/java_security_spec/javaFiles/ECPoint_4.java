import java.security.spec.ECPoint;

public class ECPoint_4 {
    public static void main(String[] args) {
        ECPoint point1 = new ECPoint(1, 2);
        ECPoint point2 = new ECPoint(1, 2);
        
        boolean isEqual = point1.equals(point2);
        System.out.println("Are the points equal? " + isEqual);
    }
}
