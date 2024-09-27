import javax.print.attribute.standard.NumberUp;

public class NumberUp_4 {
    public static void main(String[] args) {
        Class<? extends Attribute> category = NumberUp.category;
        System.out.println("Category: " + category.getName());
    }
}
