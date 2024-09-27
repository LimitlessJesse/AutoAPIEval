import java.lang.Number;

public class Number_4 {
    public static void main(String[] args) {
        Number num = new Number() {
            @Override
            public int intValue() {
                return 10;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        int intValue = num.intValue();
        System.out.println(intValue);
    }
}
