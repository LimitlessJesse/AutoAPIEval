import java.lang.Number;

public class Number_3 {
    public static void main(String[] args) {
        Number num = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 1.23f;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };

        float floatValue = num.floatValue();
        System.out.println(floatValue);
    }
}
