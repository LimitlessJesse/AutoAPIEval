import java.lang.Number;

public class Number_1 {
    public static void main(String[] args) {
        Number num = new Number() {
            @Override
            public int intValue() {
                return 10;
            }

            @Override
            public long longValue() {
                return 10L;
            }

            @Override
            public float floatValue() {
                return 10.0f;
            }

            @Override
            public double doubleValue() {
                return 10.0;
            }
        };

        byte byteValue = num.byteValue();
        System.out.println(byteValue);
    }
}
