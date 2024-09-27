import javax.print.attribute.standard.Finishings;

public class Finishings_4 {
    public static void main(String[] args) {
        Finishings finishings = Finishings.STAPLE;
        String name = finishings.getName();
        System.out.println("Finishings name: " + name);
    }
}
