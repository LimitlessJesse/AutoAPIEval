import javax.print.attribute.standard.Sides;

public class Sides_4 {
    public static void main(String[] args) {
        Sides sides = Sides.DUPLEX;
        String name = sides.getName();
        System.out.println("Name of sides: " + name);
    }
}
