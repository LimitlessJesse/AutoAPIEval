import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_2 {
    public static void main(String[] args) {
        NumberOfDocuments num1 = new NumberOfDocuments(5);
        NumberOfDocuments num2 = new NumberOfDocuments(5);

        boolean isEqual = num1.equals(num2);

        System.out.println("Are the two NumberOfDocuments objects equal? " + isEqual);
    }
}
