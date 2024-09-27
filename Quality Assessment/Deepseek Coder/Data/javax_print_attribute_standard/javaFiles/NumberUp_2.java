import javax.print.attribute.standard.NumberUp;

public class NumberUp_2 {
    public static void main(String[] args) {
        NumberUp numUp1 = new NumberUp(2);
        NumberUp numUp2 = new NumberUp(2);
        NumberUp numUp3 = new NumberUp(3);

        boolean isEqual = numUp1.equals(numUp2);
        System.out.println("numUp1 and numUp2 are equal: " + isEqual);

        isEqual = numUp1.equals(numUp3);
        System.out.println("numUp1 and numUp3 are equal: " + isEqual);
    }
}
