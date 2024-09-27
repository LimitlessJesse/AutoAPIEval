import javax.print.attribute.standard.Sides;

public class Sides_2 {
    public static void main(String[] args) {
        Sides sides = Sides.BOTH;
        String sidesName = sides.getName();
        System.out.println("Sides name: " + sidesName);
    }
}
