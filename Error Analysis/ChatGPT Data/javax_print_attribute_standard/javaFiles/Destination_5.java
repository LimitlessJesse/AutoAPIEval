import javax.print.attribute.standard.Destination;

public class Destination_5 {
    public static void main(String[] args) {
        Destination dest1 = new Destination("Printer1");
        Destination dest2 = new Destination("Printer1");

        System.out.println("dest1 equals dest2: " + dest1.equals(dest2));
    }
}
