import javax.print.attribute.standard.NumberUp;

public class NumberUp_3 {
    public static void main(String[] args) {
        NumberUp numberUp1 = new NumberUp(1);
        NumberUp numberUp2 = new NumberUp(1);
        NumberUp numberUp3 = new NumberUp(2);

        System.out.println(numberUp1.equals(numberUp2)); // true
        System.out.println(numberUp1.equals(numberUp3)); // false
        System.out.println(numberUp1.equals(null)); // false
        System.out.println(numberUp1.equals("Hello")); // false
    }
}
