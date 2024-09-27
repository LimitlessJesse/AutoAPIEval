import org.omg.DynamicAny._DynEnumStub;

public class _DynEnumStub_3 {
    public static void main(String[] args) {
        _DynEnumStub dynEnum = new _DynEnumStub();
        try {
            dynEnum.set_as_ulong(2);
        } catch (InvalidValue e) {
            System.out.println("Invalid value: " + e.getMessage());
        }
    }
}
