import javax.print.attribute.standard.Copies;

public class Copies_3 {
    public static void main(String[] args) {
        Copies copies = new Copies(5);
        Class<? extends Attribute> category = copies.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
