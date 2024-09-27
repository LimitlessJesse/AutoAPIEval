import javax.print.attribute.standard.Copies;

public class Copies_4 {
    public static void main(String[] args) {
        Copies copies1 = new Copies(1);
        Copies copies2 = new Copies(1);
        
        System.out.println(copies1.equals(copies2)); // Output: true
    }
}
