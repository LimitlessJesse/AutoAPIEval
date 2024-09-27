import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_2 {
    public static void main(String[] args) {
        NumberOfDocuments num1 = new NumberOfDocuments(5);
        NumberOfDocuments num2 = new NumberOfDocuments(5);
        NumberOfDocuments num3 = new NumberOfDocuments(10);

        System.out.println(num1.equals(num2)); // true
        System.out.println(num1.equals(num3)); // false
        System.out.println(num1.equals(null)); // false
        System.out.println(num1.equals("Hello")); // false
    }
}
