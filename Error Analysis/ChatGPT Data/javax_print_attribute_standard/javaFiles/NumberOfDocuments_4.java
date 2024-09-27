import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_4 {
    public static void main(String[] args) {
        NumberOfDocuments numberOfDocuments = new NumberOfDocuments(5);
        System.out.println("Number of documents: " + numberOfDocuments.getValue());
    }
}
