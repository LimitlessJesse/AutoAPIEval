import java.io.ObjectOutputStream;

public class ObjectOutputStream_PutField_2 {
    public static void main(String[] args) {
        ObjectOutputStream.PutField putField = new ObjectOutputStream.PutField() {
            @Override
            public void put(String name, byte val) {
                System.out.println("Field Name: " + name + ", Field Value: " + val);
            }

            @Override
            public void put(String name, char val) {
            }

            @Override
            public void put(String name, double val) {
            }

            @Override
            public void put(String name, float val) {
            }

            @Override
            public void put(String name, int val) {
            }

            @Override
            public void put(String name, long val) {
            }

            @Override
            public void put(String name, Object val) {
            }

            @Override
            public void put(String name, short val) {
            }

            @Override
            public void write(ObjectOutput out) {
            }
        };

        putField.put("age", (byte) 25);
    }
}
