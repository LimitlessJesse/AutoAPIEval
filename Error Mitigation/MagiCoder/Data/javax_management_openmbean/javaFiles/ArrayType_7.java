import javax.management.openmbean.ArrayType;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;

public class ArrayType_7 {
    public static void main(String[] args) {
        // Create an ArrayType instance
        ArrayType arrayType = new ArrayType(SimpleType.DOUBLE, new int[]{2, 2});

        // Print the string representation of the ArrayType instance
        System.out.println(arrayType.toString());
    }
}
