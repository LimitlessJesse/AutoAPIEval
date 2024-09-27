import java.lang.Integer;

public class Integer_4 {
    public static void main(String[] args) {
        String number = "10";
        int radix = 2;
        
        Integer result = Integer.valueOf(number, radix);
        
        System.out.println("Result: " + result);
    }
}
