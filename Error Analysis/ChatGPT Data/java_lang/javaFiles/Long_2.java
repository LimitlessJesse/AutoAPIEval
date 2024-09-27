import java.lang.Long;

public class Long_2 {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE;
        long b = Long.MIN_VALUE;
        
        long max = Long.max(a, b);
        System.out.println("The maximum value between " + a + " and " + b + " is: " + max);
    }
}
