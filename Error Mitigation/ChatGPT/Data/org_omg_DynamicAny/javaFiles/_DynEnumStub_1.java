import org.omg.DynamicAny._DynEnumStub;

public class _DynEnumStub_1 {
    public static void main(String[] args) {
        _DynEnumStub dynEnum = new _DynEnumStub();
        
        try {
            dynEnum.set_as_string("ENUM_VALUE");
        } catch (InvalidValue e) {
            System.out.println("Invalid IDL identifier for enumerated type");
        }
    }
}
