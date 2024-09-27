import javax.management.openmbean.ArrayType;
import javax.management.openmbean.CompositeType;
import javax.management.openmbean.OpenType;
import javax.management.openmbean.SimpleType;

public class ArrayType_6 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(SimpleType.DOUBLE, new int[]{2, 2});
        System.out.println(arrayType.hashCode());
    }
}
