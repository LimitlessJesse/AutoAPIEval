import javax.xml.validation.TypeInfoProvider;
import javax.xml.validation.TypeInfo;

public class TypeInfoProvider_2 {
    public static void main(String[] args) {
        TypeInfoProvider provider = new TypeInfoProvider(); // Instantiate the TypeInfoProvider
        int index = 0; // Specify the index of the attribute
        TypeInfo typeInfo = provider.getAttributeTypeInfo(index); // Get the TypeInfo object for the specified attribute
        if (typeInfo != null) {
            System.out.println("Type of attribute at index " + index + ": " + typeInfo.getTypeName());
        } else {
            System.out.println("Type information not available for attribute at index " + index);
        }
    }
}
