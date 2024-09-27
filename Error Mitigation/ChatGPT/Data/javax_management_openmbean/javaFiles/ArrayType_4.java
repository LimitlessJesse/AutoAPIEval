import javax.management.openmbean.ArrayType;

public class ArrayType_4 {
    public static void main(String[] args) {
        ArrayType arrayType = new ArrayType(1, SimpleType.INTEGER);
        Object obj = new int[]{1, 2, 3};
        boolean isValue = arrayType.isValue(obj);
        System.out.println("Is obj a value for this ArrayType instance? " + isValue);
    }
}
