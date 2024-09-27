import javax.print.attribute.standard.NumberUpSupported;

public class NumberUpSupported_5 {
    public static void main(String[] args) {
        NumberUpSupported numUp1 = new NumberUpSupported(1, 2, 3);
        NumberUpSupported numUp2 = new NumberUpSupported(1, 2, 3);
        NumberUpSupported numUp3 = new NumberUpSupported(4, 5, 6);

        System.out.println(numUp1.equals(numUp2)); // true
        System.out.println(numUp1.equals(numUp3)); // false
    }
}
