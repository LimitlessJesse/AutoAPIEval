import java.lang.Integer;

public class Integer_5 {
    public static void main(String[] args) {
        String number1 = "10";
        String number2 = "0x1A";
        String number3 = "#FF";
        String number4 = "012";

        Integer int1 = Integer.decode(number1);
        Integer int2 = Integer.decode(number2);
        Integer int3 = Integer.decode(number3);
        Integer int4 = Integer.decode(number4);

        System.out.println("Decoded Integer 1: " + int1);
        System.out.println("Decoded Integer 2: " + int2);
        System.out.println("Decoded Integer 3: " + int3);
        System.out.println("Decoded Integer 4: " + int4);
    }
}
