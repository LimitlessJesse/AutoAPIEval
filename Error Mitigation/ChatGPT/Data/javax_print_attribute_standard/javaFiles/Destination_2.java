import javax.print.attribute.standard.Destination;

public class Destination_2 {
    public static void main(String[] args) {
        Destination dest1 = new Destination("http://example.com/printer1");
        Destination dest2 = new Destination("http://example.com/printer2");

        System.out.println("Are dest1 and dest2 equal? " + dest1.equals(dest2));
    }
}
