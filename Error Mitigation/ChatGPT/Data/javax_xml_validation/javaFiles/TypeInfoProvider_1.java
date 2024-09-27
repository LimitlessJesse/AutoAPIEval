import javax.xml.validation.TypeInfoProvider;

public class TypeInfoProvider_1 {
    public static void main(String[] args) {
        // Assume validatorHandler is already set to the ContentHandler
        TypeInfoProvider typeInfoProvider = (TypeInfoProvider) validatorHandler;
        TypeInfo typeInfo = typeInfoProvider.getElementTypeInfo();
        System.out.println("Type of current element: " + typeInfo);
    }
}
