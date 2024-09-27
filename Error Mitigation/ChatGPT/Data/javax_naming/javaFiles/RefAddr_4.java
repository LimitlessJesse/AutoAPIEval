import javax.naming.RefAddr;

public class RefAddr_4 {
    public static void main(String[] args) {
        RefAddr refAddr1 = new RefAddr("addressType", "addressContent");
        RefAddr refAddr2 = new RefAddr("addressType", "addressContent");

        boolean isEqual = refAddr1.equals(refAddr2);
        System.out.println("Are refAddr1 and refAddr2 equal? " + isEqual);
    }
}
