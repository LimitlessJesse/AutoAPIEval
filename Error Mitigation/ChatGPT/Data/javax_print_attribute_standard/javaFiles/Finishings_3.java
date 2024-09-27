import javax.print.attribute.standard.Finishings;

public class Finishings_3 {
    public static void main(String[] args) {
        Finishings finishings = Finishings.STAPLE;
        String categoryName = finishings.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
