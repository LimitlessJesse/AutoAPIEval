import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_5 {
    public static void main(String[] args) {
        NumberOfDocuments numberOfDocuments = new NumberOfDocuments(5);
        Class<? extends Attribute> category = numberOfDocuments.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
