import javax.print.attribute.standard.Copies;

public class Copies_5 {
    public static void main(String[] args) {
        Copies copies = new Copies(5);
        String attributeName = copies.getName();
        System.out.println("Attribute Name: " + attributeName);
    }
}
