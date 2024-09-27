import javax.management.openmbean.CompositeType;
import javax.management.openmbean.CompositeData;
import javax.management.openmbean.OpenType;

public class CompositeType_5 {
    public static void main(String[] args) {
        CompositeType compositeType = new CompositeType("typeName", "description", new String[]{"item1"}, new String[]{"item1"}, new OpenType[]{OpenType.STRING});
        CompositeData compositeData = new CompositeData() {
            @Override
            public CompositeType getCompositeType() {
                return compositeType;
            }
        };

        boolean isValue = compositeType.isValue(compositeData);
        System.out.println("Is value: " + isValue);
    }
}
