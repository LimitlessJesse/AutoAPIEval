import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_2 {
    public static void main(String[] args) {
        NumberOfDocuments attribute1 = new NumberOfDocuments(5);
        NumberOfDocuments attribute2 = new NumberOfDocuments(5);
        
        System.out.println("Are attribute1 and attribute2 equal? " + attribute1.equals(attribute2));
    }
}
