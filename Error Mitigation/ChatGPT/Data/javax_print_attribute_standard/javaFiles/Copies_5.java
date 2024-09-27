import javax.print.attribute.standard.Copies;

public class Copies_5 {
    public static void main(String[] args) {
        Copies copies = new Copies(3);
        Class<? extends Attribute> category = copies.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
