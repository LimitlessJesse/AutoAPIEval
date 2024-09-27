import javax.print.attribute.standard.NumberUp;

public class NumberUp_3 {
    public static void main(String[] args) {
        NumberUp numberUp1 = new NumberUp(2);
        NumberUp numberUp2 = new NumberUp(2);
        
        System.out.println("Are numberUp1 and numberUp2 equal? " + numberUp1.equals(numberUp2));
    }
}
