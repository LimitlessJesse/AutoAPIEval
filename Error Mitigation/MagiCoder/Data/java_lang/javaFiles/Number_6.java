import java.lang.Number;

public class Number_6 {
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

            @Override
            public byte byteValue() {
                return 10;
            }

            @Override
            public short shortValue() {
                return 10;
            }
        };

        short shortValue = num.shortValue();
        System.out.println(shortValue);
    }
}
