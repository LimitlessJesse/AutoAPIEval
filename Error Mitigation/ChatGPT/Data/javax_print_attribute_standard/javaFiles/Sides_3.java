import javax.print.attribute.standard.Sides;

public class Sides_3 {
    public static void main(String[] args) {
        Sides sides = Sides.DUPLEX;
        String categoryName = sides.getName();
        System.out.println("Category name: " + categoryName);
    }
}
