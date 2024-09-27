import java.lang.Integer;

public class Integer_2 {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;

        int result = num1.compareTo(num2);

        if(result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if(result > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
