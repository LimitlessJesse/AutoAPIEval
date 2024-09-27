import javax.print.attribute.standard.Copies;

public class Copies_3 {
    public static void main(String[] args) {
        Copies copies1 = new Copies(3);
        Copies copies2 = new Copies(3);
        
        System.out.println("Are copies1 and copies2 equal? " + copies1.equals(copies2));
    }
}
