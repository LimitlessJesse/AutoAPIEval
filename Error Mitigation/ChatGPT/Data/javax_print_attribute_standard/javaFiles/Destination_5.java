import javax.print.attribute.standard.Destination;

public class Destination_5 {
    public static void main(String[] args) {
        Destination destination = new Destination("http://example.com/printer");
        Class<? extends Attribute> category = destination.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
