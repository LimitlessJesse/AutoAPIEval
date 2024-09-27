import javax.sql.rowset.serial.SerialRef;

public class SerialRef_3 {
    public static void main(String[] args) {
        SerialRef ref = new SerialRef();
        String baseTypeName = ref.getBaseTypeName();
        System.out.println("Base type name: " + baseTypeName);
    }
}
