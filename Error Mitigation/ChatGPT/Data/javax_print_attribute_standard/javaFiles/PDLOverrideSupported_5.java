import javax.print.attribute.standard.PDLOverrideSupported;

public class PDLOverrideSupported_5 {
    public static void main(String[] args) {
        PDLOverrideSupported pdlOverrideSupported = new PDLOverrideSupported(PDLOverrideSupported.ATTEMPTED);
        EnumSyntax[] enumValueTable = pdlOverrideSupported.getEnumValueTable();
        
        for(EnumSyntax enumValue : enumValueTable) {
            System.out.println(enumValue.getValue());
        }
    }
}
